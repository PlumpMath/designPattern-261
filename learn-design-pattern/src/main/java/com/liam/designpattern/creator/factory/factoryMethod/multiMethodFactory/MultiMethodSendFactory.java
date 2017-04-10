package com.liam.designpattern.creator.factory.factoryMethod.multiMethodFactory;

import com.liam.designpattern.creator.factory.factoryMethod.commonFactory.Sender;
import com.liam.designpattern.creator.factory.factoryMethod.commonFactory.impl.MailSender;
import com.liam.designpattern.creator.factory.factoryMethod.commonFactory.impl.SmsSender;

/**
 * Created by LiamCao on 2017/4/10.
 */
public class MultiMethodSendFactory {

    public Sender produceMail(){
        return new MailSender();
    }

    public Sender produceSms(){
        return new SmsSender();
    }

    /**
     * test
     */
    public static void main(String[] args){
        MultiMethodSendFactory msf = new MultiMethodSendFactory();
        Sender sender = msf.produceSms();
        sender.send();
    }
}
