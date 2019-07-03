package com.zyx.library.entity;

/*添加图书结果的包装类*/
public class ProcessResult {
    boolean success;

    public ProcessResult(boolean success) {
        this.success = success;
    }

    public boolean isSuccess() {

        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    @Override
    public String toString() {
        return "ProcessResult{" +
                "success=" + success +
                '}';
    }
}
