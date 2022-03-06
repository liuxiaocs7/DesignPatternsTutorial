package com.liuxiaocs.pattern.memento.black_box;

import com.liuxiaocs.pattern.memento.white_box.RoleStateMemento;

/**
 * 备忘录对象管理对象
 */
public class RoleStateCaretaker {
    // 声明RoleStateMemento类型的变量
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
