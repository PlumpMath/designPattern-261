package com.liam.designpattern.behavioral.chain.exactChain;

/**
 * Created by LiamCao on 2017/4/11.
 *
 * 此处强调一点就是，链接上的请求可以是一条链，可以是一个树，还可以是一个环，模式本身不约束这个，
 * 需要我们自己去实现，同时，在一个时刻，命令只允许由一个对象传给另一个对象，而不允许传给多个对象。
 */
public class TestHandler {
    /**
     * test
     */
    public static void main(String[] args){
        LeaveRequest lr = new LeaveRequest(2,"xxf");
        HR hr = new HR();
        Manager manager = new Manager();
        PM pm = new PM();

        pm.setHandler(hr);
        hr.setHandler(manager);

        pm.handleRequest(lr);
    }

}
