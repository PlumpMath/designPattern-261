package com.liam.designpattern.structural.proxy;

import com.liam.designpattern.structural.decorator.Source;
import com.liam.designpattern.structural.decorator.Sourceable;

/**
 * Created by LiamCao on 2017/4/11.
 */
public class Proxy implements Sourceable{

    private Source source;

    public Proxy() {
        super();
        this.source = new Source();
    }

    @Override
    public void m1() {
        before();
        source.m1();
        after();
    }


    private void before(){
        System.out.println("===before===");
    }

    private void after(){
        System.out.println("===after===");
    }



    /**
     * test
     */
    public static void main(String[] args){
        Proxy proxy = new Proxy();
        proxy.m1();
    }

}
