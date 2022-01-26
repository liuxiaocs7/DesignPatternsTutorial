package com.liuxiaocs.pattern.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 代理对象工厂，用来获取代理对象(目标对象所属类的子类) 使用继承
 */
public class ProxyFactory implements MethodInterceptor {

    // 声明火车站对象
    private TrainStation station = new TrainStation();

    /**
     * @param o 新创建的代理类对象
     * @param method 需要代理执行的方法
     * @param objects 方法的参数
     * @param methodProxy
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("代理点收取一些服务费用(CGLIB动态代理方式)");
        // 要调用目标对象的方法
        Object obj = method.invoke(station, objects);
        return obj;
    }

    public TrainStation getProxyObject() {
        // 创建Enhancer对象，类似于JDK代理中的Proxy类
        Enhancer enhancer = new Enhancer();
        // 设置父类的字节码对象(继承实现的，代理类是子类)，指定父类
        enhancer.setSuperclass(TrainStation.class);
        // 设置回调函数
        // 需要要给Callback类型参数
        // MethodInterceptor extends Callback 所以传入 MethodInterceptor类型即可
        enhancer.setCallback(this);
        // 创建代理对象
        TrainStation proxyObject = (TrainStation) enhancer.create();
        return proxyObject;
    }
}
