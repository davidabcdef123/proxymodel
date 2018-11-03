package com.custom;

import com.staticmodel.Person;

import java.lang.reflect.Method;

/**
 * Created by sc on 2018/11/2.
 */
public class CustomMeipo implements CustomInvocationHandler {

    private Person target;

    public Object getInstance(Person target)throws Exception{
        this.target=target;
        Class<?> clazz = target.getClass();
        //用来生成一个新的对象（字节码重组来实现）
        return CustomProxy.newPorxyInstance(new CustomClassLoader(),clazz.getInterfaces(),this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("intercept-before");
        method.invoke(this.target, args);
        System.out.println("intercept-end");
        return null;
    }
}
