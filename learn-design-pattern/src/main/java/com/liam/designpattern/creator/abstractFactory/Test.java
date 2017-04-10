package com.liam.designpattern.creator.abstractFactory;

import com.liam.designpattern.creator.factory.factoryMethod.commonFactory.Sender;

/**
 * Created by LiamCao on 2017/4/10.
 */
public class Test {
    /**
     * test
     */
    public static void main(String[] args){
        SendMailFactory mailFactory = new SendMailFactory();
        Sender sender = mailFactory.produce();
        sender.send();

        SendSmsFactory smsFactory = new SendSmsFactory();
        sender = smsFactory.produce();
        sender.send();
    }
}
