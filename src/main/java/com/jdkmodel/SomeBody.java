package com.jdkmodel;

import com.staticmodel.Person;

/**
 * Created by sc on 2018/11/2.
 */
public class SomeBody implements Person {
    @Override
    public void buyEat() {
        System.out.println("我要买吃的");
    }

    @Override
    public void buyColse() {
        System.out.println("我要买衣服");
    }

    @Override
    public void buyShoess() {
        System.out.println("我要买鞋");
    }
}
