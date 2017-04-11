package com.liam.designpattern.structural.adapter.interfaceadapter;

/**
 * Created by LiamCao on 2017/4/11.
 */
public class ConcreteChargeFunc extends InterfaceAdapter {
    @Override
    public void charge() {
        System.out.println("this is charge from ConcreteChargeFunc");
    }
}
