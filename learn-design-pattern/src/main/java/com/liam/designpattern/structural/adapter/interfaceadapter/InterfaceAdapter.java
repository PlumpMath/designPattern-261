package com.liam.designpattern.structural.adapter.interfaceadapter;

import com.liam.designpattern.structural.adapter.classadapter.MainlandSocket;

/**
 * Created by LiamCao on 2017/4/11.
 * 我们也常会遇到,接口中定义了太多的方法，以致于有时我们在一些实现类中并不是都需要.
 * 此时我们可以通过定义一个中间的abstract类来implements接口，其中方法都实现为空的。
 * 后续再new 类来extend这个abstract类,此时针对需要的方法填写具体的业务逻辑。另外的方法就忽视掉。
 */
public abstract class InterfaceAdapter implements MainlandSocket{

    @Override
    public void charge() {

    }

    @Override
    public void xxfuntionality() {

    }
}
