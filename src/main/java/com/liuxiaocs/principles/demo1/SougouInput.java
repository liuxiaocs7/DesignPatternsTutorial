package com.liuxiaocs.principles.demo1;


/**
 * 搜狗输入法
 * 聚合关系
 */
public class SougouInput {
    private AbstractSkin skin;

    public void setSkin(AbstractSkin skin) {
        this.skin = skin;
    }

    public void display() {
        // 进行皮肤的展示
        skin.display();
    }
}
