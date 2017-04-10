package com.liam.designpattern.creator.factory.factoryMethod.commonFactory;

import com.liam.designpattern.creator.factory.factoryMethod.commonFactory.impl.MailSender;
import com.liam.designpattern.creator.factory.factoryMethod.commonFactory.impl.SmsSender;

/**
 * Created by LiamCao on 2017/4/10.
 */
public class SendFactory {

    public Sender produce(String type){
        switch (type){
            case "mail":
                return new MailSender();
            case "sms":
                return new SmsSender();
            default:
                System.out.println("please input correct type");
                return null;
        }
    }


    /**
     * test
     */
    public static void main(String[] args){
        SendFactory sf = new SendFactory();
        Sender sender = sf.produce("sms");
        sender.send();
    }

}
