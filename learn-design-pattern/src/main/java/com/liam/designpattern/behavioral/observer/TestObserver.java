package com.liam.designpattern.behavioral.observer;

/**
 * Created by LiamCao on 2017/4/11.
 */
public class TestObserver {

    /**
     * test
     */
    public static void main(String[] args){
        Subject subject = new Subject();
        subject.add(new Observer1());
        subject.add(new Observer2());
        subject.operation();
    }
}
