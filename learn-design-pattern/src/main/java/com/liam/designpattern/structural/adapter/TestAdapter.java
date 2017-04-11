package com.liam.designpattern.structural.adapter;

import com.liam.designpattern.structural.adapter.classadapter.ClassAdapter;
import com.liam.designpattern.structural.adapter.classadapter.HongKongPlugin;
import com.liam.designpattern.structural.adapter.interfaceadapter.ConcreteChargeFunc;
import com.liam.designpattern.structural.adapter.interfaceadapter.ConcreteXxxFunc;
import com.liam.designpattern.structural.adapter.objectadapter.ObjectAdapter;

/**
 * Created by LiamCao on 2017/4/11.
 */
public class TestAdapter {

    /**
     * test
     * 总结一下三种适配器模式的应用场景：

     类的适配器模式：
        当希望将一个类转换成满足另一个新接口的类时，可以使用类的适配器模式，创建一个新类，继承原有的类，实现新的接口即可。

     对象的适配器模式：
        当希望将一个对象转换成满足另一个新接口的对象时，可以创建一个Wrapper类，持有原类的一个实例，在Wrapper类的方法中，调用实例的方法就行。

     接口的适配器模式：
        当不希望实现一个接口中所有的方法时，可以创建一个抽象类Wrapper，实现所有方法，我们写别的类的时候，继承抽象类即可。
     */
    public static void main(String[] args) {
       //类的适配器
        ClassAdapter classAdapter = new ClassAdapter();
        classAdapter.xxfuntionality();
        classAdapter.charge();
        classAdapter.transferData();

        System.out.println("===========");

       //对象的适配器
        ObjectAdapter objectAdapter = new ObjectAdapter(new HongKongPlugin());
        objectAdapter.xxfuntionality();
        objectAdapter.charge();

        System.out.println("===========");

       //接口的适配器
        ConcreteChargeFunc concreteChargeFunc = new ConcreteChargeFunc();
        concreteChargeFunc.charge();
        ConcreteXxxFunc concreteXxxFunc = new ConcreteXxxFunc();
        concreteXxxFunc.xxfuntionality();
    }
}
