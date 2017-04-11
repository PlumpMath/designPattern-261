package com.liam.designpattern.behavioral.visitor;

/**
 * Created by LiamCao on 2017/4/11.
 */
public interface Sth {

    public void accept(Visitor visitor);

    public String getNiceView();
}
