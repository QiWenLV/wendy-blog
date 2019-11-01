package com.zqw.wendyadmin.common.bean;

/**
 * @Classname CheckedFunction
 * @Description 受查异常的函数式接口
 * @Date 2019/11/1 22:38
 * @Created by zqw
 * @Version 1.0
 */
@FunctionalInterface
public interface CheckedFunction<T,R> {
    R apply(T t) throws Exception;
}
