package com.liam.designpattern.creator.abstractFactory;

import com.liam.designpattern.creator.factory.factoryMethod.commonFactory.Sender;
import com.liam.designpattern.creator.factory.factoryMethod.commonFactory.impl.SmsSender;

/**
 * Created by LiamCao on 2017/4/10.
 */
public class SendSmsFactory implements Provider {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
