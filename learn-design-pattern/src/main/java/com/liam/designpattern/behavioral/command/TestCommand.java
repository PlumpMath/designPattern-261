package com.liam.designpattern.behavioral.command;

/**
 * Created by LiamCao on 2017/4/11.
 * ziji:命令模式的好处是：用命令（command）解耦了司令（commander）和士兵（soldier）的直接联系.
 *
 * 命令模式的目的就是达到命令的发出者和执行者之间解耦，实现请求和执行分开，熟悉Struts的同学应该知道，
 * Struts其实就是一种将请求和呈现分离的技术，其中必然涉及命令模式的思想！
 */
public class TestCommand {
    /**
     * test
     */
    public static void main(String[] args){
        Soldier soldier = new Soldier();
        Command lizheng = new Lizheng(soldier);
        Commander commander = new Commander(lizheng);

        commander.action();
    }
}
