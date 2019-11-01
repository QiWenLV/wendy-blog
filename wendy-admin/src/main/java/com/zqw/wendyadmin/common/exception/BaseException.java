package com.zqw.wendyadmin.common.exception;

/**
 * @Classname BaseException
 * @Description 异常基类
 * @Date 2019/11/1 23:56
 * @Created by zqw
 * @Version 1.0
 */
public class BaseException extends RuntimeException{

    public BaseException(String message) {
        super(message);
    }

    public BaseException(String message, Throwable cause) {
        super(message, cause);
    }

}
