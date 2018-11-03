package com.jdkmodel;

import com.staticmodel.Person;
import sun.misc.ProxyGenerator;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by sc on 2018/11/2.
 */
public class JdkProxyOutFile {

    public static void main(String[] args) throws Exception {
        Person someBody = (Person) new JdkProxy().getInstance(new SomeBody());
        System.out.println(someBody.getClass());
        System.out.println(new SomeBody());
        someBody.buyEat();
        //原理
        //1 拿到被代理对象的引用，通过反射获取到他的所有接口
        //2 JDK Proxy类重新生成一个新的类、同时新的类要实现被代理类所有实现的所有的接口
        //3、动态生成Java代码，把新加的业务逻辑方法由一定的逻辑代码去调用（在代码中体现）
        //4、编译新生成的Java代码.class
        //5、再重新加载到JVM中运行
        //以上这个过程就叫字节码重组
        //JDK中有个规范，只要要是$开头的一般都是自动生成的

        //通过反编译工具可以查看源代码
        byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{Person.class});
        FileOutputStream os = new FileOutputStream("E:\\111.class");
        os.write(bytes);
        os.close();

    }


}
