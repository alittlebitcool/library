package com.zyx.library;

import org.apache.catalina.Context;
import org.apache.catalina.connector.Connector;
import org.apache.tomcat.util.descriptor.web.SecurityCollection;
import org.apache.tomcat.util.descriptor.web.SecurityConstraint;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.embedded.tomcat.TomcatConnectorCustomizer;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;

import javax.validation.Constraint;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @ Author     ：zyx.
 * @ Date       ：Created in 18:13 2018/11/18
 * @ Description：
 */


@SpringBootApplication
@MapperScan("com.zyx.library.dao")
@EnableCaching
public class LibraryApplication {
    public static void main(String[] args) {
        SpringApplication.run(LibraryApplication.class, args);
    }

    @Bean
    public TomcatServletWebServerFactory servletContainer() {
        TomcatServletWebServerFactory tomcat = new TomcatServletWebServerFactory();
        tomcat.addConnectorCustomizers((TomcatConnectorCustomizer) connector -> {
            connector.setPort(getPort());
        });
        return tomcat;
    }

    private Integer getPort() {
        int port1 = 8081,
                port2 = 8082;
        try {
            new Socket(InetAddress.getByName("127.0.0.1"), port2);
            return port1;
        } catch (IOException e) {
            return port2;
        }
    }
}
