package com.liam.designpattern.structural.decorator;

/**
 * Created by LiamCao on 2017/4/11.
 */
public class Decorator implements Sourceable{

    private Source source;

    public Decorator(Source source) {
        this.source = source;
    }

    @Override
    public void m1() {
        System.out.println("---before---");
        source.m1();
        System.out.println("---after---");
    }


    /**
     * test
     */
    public static void main(String[] args){
        Source so = new Source();
        Decorator decorator = new Decorator(so);
        decorator.m1();
    }

}
