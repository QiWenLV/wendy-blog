package com.zqw.wendyadmin.common.bean;

import lombok.Data;

/**
 * @Classname ResultData
 * @Description 返回给前端的格式
 * @Date 2019/11/1 20:04
 * @Created by zqw
 * @Version 1.0
 */
@Data
public class ResultData<T> {

    public static String SUCCESS = "0";
    public static String ERROR = "1";

    private String code;
    private String message;
    private T data;

    public ResultData() {
        this.code = ERROR;
        this.message = "网络异常，请稍后重试！";
    }

    public ResultData(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public ResultData(String code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    /**
     * 直接返回成功
     * @return
     */
    public static ResultData ok() {
       return new ResultData(SUCCESS, "操作成功");
    }

    public static <T> ResultData<T> ok(String message, T data) {
        return new ResultData<>(SUCCESS, message, data);
    }

    public static ResultData error(String message) {
        return new ResultData<>(ERROR, message);
    }

    public static ResultData error(String code, String message) {
        return new ResultData<>(code, message);
    }

    public static <T> ResultData<T> error(String code, String message,  T data) {
        return new ResultData<>(code, message, data);
    }
}
