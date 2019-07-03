package com.zyx.library.service;

import com.zyx.library.entity.BookList;
import com.zyx.library.entity.Box;

import java.util.List;

/**
 * 存箱Service
 */
public interface BoxService {

    /**
     * 获取全部存箱信息
     * @return 全部存箱信息
     */
    List<Box> getBoxList();

    /**
     * 获取一个随机的存箱
     * @return 存箱对象
     */
    Box getRandomBox();

    /**
     * 修改Box的信息
     * @param box 需要修改的box
     */
    void editBox(Box box);

    /**
     * 通过id删除存箱
     * @param id
     */
    void deleteById(int id);

    /**
     * 添加存箱
     *
     * @param box
     */
    void add(Box box);

    /**
     * 清空/归还某个存箱
     * 将存箱改为未使用
     * @param id
     */
    void cleanBoxById(int id);

    /**
     * 使用某个存箱
     * @param id
     */
    void useBoxById(int id);
}
