package com.liuxiaocs.pattern.observer;

/**
 * 抽象观察者
 */
public interface Observer {

    // 更新推送的内容
    void update(String message);
}
