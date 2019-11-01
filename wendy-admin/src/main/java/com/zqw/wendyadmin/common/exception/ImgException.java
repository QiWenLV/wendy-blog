package com.zqw.wendyadmin.common.exception;

/**
 * @Classname ImgException
 * @Description 图片异常
 * @Date 2019/11/1 23:56
 * @Created by zqw
 * @Version 1.0
 */
public class ImgException extends BaseException{

    public ImgException(String message) {
        super(message);
    }

    public ImgException(String message, Throwable cause) {
        super(message, cause);
    }
}
