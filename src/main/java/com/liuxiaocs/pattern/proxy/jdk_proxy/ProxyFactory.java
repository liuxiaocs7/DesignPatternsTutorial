package com.liuxiaocs.pattern.proxy.jdk_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 获取代理对象的工厂类
 * 代理类也实现了对象的接口
 */
public class ProxyFactory {

    // 声明目标对象
    private TrainStation station = new TrainStation();

    /**
     * 获取代理对象
     * 创建一个代理对象用来替station收费
     * 增强的方法在invoke中定义
     */
    public SellTickets getProxyObject() {
        // 返回代理对象，默认是Object类型的
        /*
            ClassLoader loader,   类加载器：用于加载代理类(代理类是在程序运行的过程中动态生成的一个类)，可以通过目标对象获取类加载器
            Class<?>[] interfaces, 代理类实现的接口的字节码对象
            InvocationHandler h  代理对象的调用处理程序(通过代理对象调用的方法进行实际的业务处理)
         */
        SellTickets proxyObject = (SellTickets) Proxy.newProxyInstance(
                station.getClass().getClassLoader(),
                station.getClass().getInterfaces(),
                new InvocationHandler() {
                    /**
                     * Object proxy, 代理对象。和proxyObject对象是同一个对象，在invoke方法基本不用
                     * Method method, 对接口中的方法进行封装的method对象
                     * Object[] args, 调用方法的实际参数
                     *
                     * 返回值：方法的返回值。通过代理方法调用的返回值
                     */
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        // System.out.println("invoke方法执行了");
                        System.out.println("代理点收取一些服务费用(JDK动态代理方式)");
                        // 执行目标对象station的方法
                        Object obj = method.invoke(station, args);
                        return obj;
                    }
                }
        );
        return proxyObject;
    }
}
