package com.study.st_word.common.exception;


import com.study.st_word.enums.ResponseEnum;

/**
 * 全局异常类, 如果需要定义其它类, 请直接继承此类
 * Created by wangyubing on 2019/5/5.
 */
public class GlobalException extends RuntimeException {

    private Integer code;

    public GlobalException(Integer code) {
        this.code = code;
    }

    public GlobalException(String message, Integer code) {
        super(message);
        this.code = code;
    }

    public GlobalException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public GlobalException(String message, Throwable cause, Integer code) {
        super(message, cause);
        this.code = code;
    }

    public GlobalException(Throwable cause, Integer code) {
        super(cause);
        this.code = code;
    }

    public GlobalException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, Integer code) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.code = code;
    }

    public GlobalException(ResponseEnum paramError) {
        super(paramError.getMessage());
        this.code = paramError.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
