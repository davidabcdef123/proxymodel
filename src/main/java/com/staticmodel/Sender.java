package com.staticmodel;

/**
 * Created by sc on 2018/11/2.
 */
public class Sender implements Person{

    private Person person;

    public Sender(Person person){
        this.person=person;
    }


    @Override
    public void buyEat() {
        person.buyEat();
        System.out.println("已从售卖者哪里买到东西");
    }

    @Override
    public void buyColse() {

    }

    @Override
    public void buyShoess() {

    }
}
