package com.liuxiaocs.pattern.proxy.cglib;

public class Client {
    public static void main(String[] args) {
        // 1.创建代理工厂对象
        ProxyFactory factory = new ProxyFactory();
        // 获取代理对象
        TrainStation proxyObject = factory.getProxyObject();
        // 调用代理对象中的sell方法进行卖票
        proxyObject.sell();
    }
}
