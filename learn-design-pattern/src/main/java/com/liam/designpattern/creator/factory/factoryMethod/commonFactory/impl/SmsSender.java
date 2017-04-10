package com.liam.designpattern.creator.factory.factoryMethod.commonFactory.impl;

import com.liam.designpattern.creator.factory.factoryMethod.commonFactory.Sender;

/**
 * Created by LiamCao on 2017/4/10.
 */
public class SmsSender implements Sender {

    @Override
    public void send() {
        System.out.println("this is sms sender");
    }
}
