package com.liuxiaocs.pattern.singleton.demo8;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 反射方式破解单例的解决方法
 */
public class Client {
    public static void main(String[] args) throws Exception {
        // 1. 获取Singleton的字节码对象
        Class clazz = Singleton.class;
        // 2. 获取无参构造方法对象
        Constructor cons = clazz.getDeclaredConstructor();
        // 3. 取消访问检查
        cons.setAccessible(true);
        // 4. 创建Singleton对象
        // 第一次可以正常创建对象，但是第二次就会抛异常
        Singleton s1 = (Singleton) cons.newInstance();
        Singleton s2 = (Singleton) cons.newInstance();

        // 如果返回的是true，说明并没有破坏单例模式，如果是false，说明破坏了单例模式
        System.out.println(s1 == s2);
    }
}
