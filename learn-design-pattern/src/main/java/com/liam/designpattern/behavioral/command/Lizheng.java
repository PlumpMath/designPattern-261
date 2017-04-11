package com.liam.designpattern.behavioral.command;

/**
 * Created by LiamCao on 2017/4/11.
 */
public class Lizheng implements Command {

    private Soldier soldier;

    public Lizheng(Soldier soldier) {
        this.soldier = soldier;
    }

    @Override
    public void execute() {
        soldier.action();
    }
}
