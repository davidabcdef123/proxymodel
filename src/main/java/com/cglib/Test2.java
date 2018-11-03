package com.cglib;

import com.jdkmodel.SomeBody;
import com.staticmodel.Person;

/**
 * Created by sc on 2018/11/3.
 */
public class Test2 {

    public static void main(String[] args) {
        Person obj = (Person) new CgLibMeipo().getInstance(SomeBody.class);
        obj.buyEat();
        System.out.println("-------------------");
    }
}
