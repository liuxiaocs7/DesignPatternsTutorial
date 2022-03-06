package com.liuxiaocs.pattern.memento.black_box;


public class Client {
    public static void main(String[] args) {
        System.out.println("--------------大战boss前---------------");
        // 创建游戏角色对象
        GameRole gameRole = new GameRole();
        // 初始化状态
        gameRole.initState();
        gameRole.stateDisplay();

        // 将该游戏角色内部状态进行备份
        // 创建管理者对象
        RoleStateCaretaker roleStateCaretaker = new RoleStateCaretaker();
        // 获取当前的状态并保存下来
        roleStateCaretaker.setMemento(gameRole.saveState());

        System.out.println("--------------大战boss后---------------");
        // 损耗严重
        gameRole.fight();
        gameRole.stateDisplay();

        System.out.println("--------------恢复之前的状态---------------");
        gameRole.recoverState(roleStateCaretaker.getMemento());
        gameRole.stateDisplay();
    }
}
