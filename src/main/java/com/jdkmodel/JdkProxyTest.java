package com.jdkmodel;

import com.staticmodel.Person;

/**
 * Created by sc on 2018/11/2.
 */
public class JdkProxyTest {

    public static void main(String[] args) {
        Person someBody= (Person) new JdkProxy().getInstance(new SomeBody());
        someBody.buyEat();
    }
}
