package com.liam.designpattern.behavioral.command;

/**
 * Created by LiamCao on 2017/4/11.
 */
public class Commander {

    private Command command;

    public Commander(Command command) {
        this.command = command;
    }

    public void action(){
        command.execute();
    }
}
