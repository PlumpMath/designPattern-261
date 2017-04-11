package com.liam.designpattern.structural.decorator;

/**
 * Created by LiamCao on 2017/4/11.
 */
public class Source implements Sourceable {
    @Override
    public void m1() {
        System.out.println("method m1 in Source");
    }
}
