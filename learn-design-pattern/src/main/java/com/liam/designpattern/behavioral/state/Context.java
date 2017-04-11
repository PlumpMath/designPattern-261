package com.liam.designpattern.behavioral.state;

/**
 * Created by LiamCao on 2017/4/11.
 */
public class Context {

    private State state;

    public Context(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }


    public void method(){
        if("state1".equals(state.getStr())){
            state.m1();
        }else if("state2".equals(state.getStr())){
            state.m2();
        }
    }
}
