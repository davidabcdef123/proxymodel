package com.staticmodel;

/**
 * Created by sc on 2018/11/2.
 */
public class Test {

    public static void main(String[] args) {
        Sender sender = new Sender(new Buyer());
        sender.buyEat();
    }
}
