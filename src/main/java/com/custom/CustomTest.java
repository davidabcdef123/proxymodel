package com.custom;

import com.staticmodel.Buyer;
import com.staticmodel.Person;

/**
 * Created by sc on 2018/11/3.
 */
public class CustomTest {

    public static void main(String[] args) throws Exception {
        Person obj = (Person)new CustomMeipo().getInstance(new Buyer());
        System.out.println(obj.getClass());
        obj.buyEat();
    }
}
