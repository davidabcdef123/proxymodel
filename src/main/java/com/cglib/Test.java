package com.cglib;

/**
 * Created by sc on 2018/11/2.
 */
public class Test {

    public static void main(String[] args) {
        ZhangSan obj = (ZhangSan) new CgLibMeipo().getInstance(ZhangSan.class);
        obj.findLove();
        System.out.println("-------------------");
    }
}
