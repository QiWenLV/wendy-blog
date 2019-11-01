package com.zqw.wendyadmin.common.bean.tuple;

/**
 * @Classname Tuple2
 * @Description 二元组
 * @Date 2019/11/1 22:46
 * @Created by zqw
 * @Version 1.0
 */
public class Tuple2<A, B> {

    public final A f1;
    public final B f2;

    private Tuple2(A f1, B f2) {
        this.f1 = f1;
        this.f2 = f2;
    }

    public static <A, B> Tuple2<A, B> of(A f1, B f2) {
        return new Tuple2<>(f1,f2);
    }

}
