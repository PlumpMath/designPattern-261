package com.liam.designpattern.behavioral.state;

/**
 * Created by LiamCao on 2017/4/11.
 */
public class TestState {

    /**
     * test
     */
    public static void main(String[] args){
        State state = new State();
        state.setStr("state2");
        Context context = new Context(state);
        context.method();

        state.setStr("state1");
        context.method();
    }
}
