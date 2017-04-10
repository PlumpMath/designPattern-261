package com.liam.designpattern.creator.abstractFactory;

import com.liam.designpattern.creator.factory.factoryMethod.commonFactory.Sender;
import com.liam.designpattern.creator.factory.factoryMethod.commonFactory.impl.MailSender;

/**
 * Created by LiamCao on 2017/4/10.
 */
public class SendMailFactory implements Provider {
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
