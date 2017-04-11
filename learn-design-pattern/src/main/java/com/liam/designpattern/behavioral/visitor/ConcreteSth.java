package com.liam.designpattern.behavioral.visitor;

/**
 * Created by LiamCao on 2017/4/11.
 */
public class ConcreteSth implements Sth {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String getNiceView() {
        return "Maldives";
    }
}
