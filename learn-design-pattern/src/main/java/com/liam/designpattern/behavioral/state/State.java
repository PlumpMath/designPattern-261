package com.liam.designpattern.behavioral.state;

/**
 * Created by LiamCao on 2017/4/11.
 */
public class State {

    private String str;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }


    public void m1(){
        System.out.println("m1 in State");
    }

    public void m2(){
        System.out.println("m2 in State");
    }
}
