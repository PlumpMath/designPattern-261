package com.liam.designpattern.behavioral.visitor;

/**
 * Created by LiamCao on 2017/4/11.
 */
public class ConcreteVisitor implements Visitor {
    @Override
    public void visit(Sth sth) {
       System.out.println("just visit :" + sth.getNiceView());
    }
}
