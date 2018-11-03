package com.custom;

import java.lang.reflect.Method;

/**
 * Created by sc on 2018/11/2.
 */
public interface CustomInvocationHandler {

    public Object invoke(Object proxy, Method method,Object[] args)throws Throwable;
}
