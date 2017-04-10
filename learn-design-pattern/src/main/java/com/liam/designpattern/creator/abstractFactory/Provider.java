package com.liam.designpattern.creator.abstractFactory;

import com.liam.designpattern.creator.factory.factoryMethod.commonFactory.Sender;

/**
 * Created by LiamCao on 2017/4/10.
 */
public interface Provider {

    public Sender produce();
}
