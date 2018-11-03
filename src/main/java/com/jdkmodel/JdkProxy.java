package com.jdkmodel;

import com.staticmodel.Person;
import sun.java2d.pipe.SpanIterator;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by sc on 2018/11/2.
 */
public class JdkProxy implements InvocationHandler {
    //被代理的对象，把被代理的对象保存去依赖
    private Person target;

    public Object getInstance(Person target){
        this.target=target;
        Class<?> clazz=target.getClass();
        //通过反射来生成一个新的对象（字节码重组）
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("我是快递员我要准备拿快递");
        method.invoke(this.target, args);
        System.out.println("已经拿到快递");
        return null;
    }
}
