package com.liam.designpattern.creator.singleton;

/**
 * Created by LiamCao on 2017/4/10.
 */
public class MySingleton {

    private MySingleton(){}

    private static MySingleton instance = new MySingleton();

    public static MySingleton getInstance(){
        return instance;
    }
}
