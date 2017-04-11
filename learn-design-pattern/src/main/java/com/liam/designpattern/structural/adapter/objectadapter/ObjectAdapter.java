package com.liam.designpattern.structural.adapter.objectadapter;

import com.liam.designpattern.structural.adapter.classadapter.HongKongPlugin;
import com.liam.designpattern.structural.adapter.classadapter.MainlandSocket;

/**
 * Created by LiamCao on 2017/4/11.
 */
public class ObjectAdapter implements MainlandSocket {

    private HongKongPlugin hongKongPlugin;

    public ObjectAdapter(HongKongPlugin hongKongPlugin) {
        this.hongKongPlugin = hongKongPlugin;
    }

    @Override
    public void charge() {
        hongKongPlugin.charge();
    }

    @Override
    public void xxfuntionality() {
        System.out.println("mainland xxfunctionality... in ObjectAdapter");
    }
}
