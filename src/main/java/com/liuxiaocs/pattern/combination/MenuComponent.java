package com.liuxiaocs.pattern.combination;

/**
 * 菜单组件：属于抽象根节点
 */
public abstract class MenuComponent {
    // 菜单组件的名称
    protected String name;
    // 菜单组件的层级
    protected int level;

    // 添加子菜单
    public void add(MenuComponent menuComponent) {
        // 如果是菜单项不支持添加菜单项
        throw new UnsupportedOperationException();
    }

    // 移除子菜单
    public void remove(MenuComponent menuComponent) {
        // 菜单项无法直接移除
        throw new UnsupportedOperationException();
    }

    // 获取指定的子菜单
    public MenuComponent getChild(int index) {
        throw new UnsupportedOperationException();
    }

    // 获取菜单或者菜单项名称
    public String getName() {
        return name;
    }

    // 打印菜单名称的方法(包含子菜单和子菜单项)
    public abstract void print();
}
