package com.zqw.wendyadmin.common.exception;

/**
 * @Classname DbDataException
 * @Description TODO
 * @Date 2019/11/2 1:03
 * @Created by zqw
 * @Version 1.0
 */
public class DbDataException extends BaseException {

    public DbDataException(String message) {
        super(message);
    }

    public DbDataException(String message, Throwable cause) {
        super(message, cause);
    }
}
