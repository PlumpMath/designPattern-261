package com.liam.designpattern.creator.prototype;

import java.io.*;

/**
 * Created by LiamCao on 2017/4/11.
 */
public class Prototype implements Cloneable, Serializable{

    private String str;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    /**
     * 浅复制.
     *      将一个对象复制后，基本数据类型的变量都会重新创建，而引用类型，指向的还是原对象所指向的。
     * @return
     * @throws CloneNotSupportedException
     */
    public Object cloneMyself() throws CloneNotSupportedException {
       return super.clone();
    }



    /**
     * test
     */
    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
        Prototype prototype = new Prototype();
        prototype.setStr("xxx");
        Prototype cloneOne = (Prototype)prototype.cloneMyself();
        System.out.println("浅复制：" + cloneOne.getClass().getName() + " -> " + cloneOne.getStr());

        Prototype deepOne = (Prototype)prototype.deepClonMyself();
        System.out.println("深复制：" + deepOne.getClass().getName() + " -> " + deepOne.getStr());
    }


    /**
     * 深复制.
     *      将一个对象复制后，不论是基本数据类型还有引用类型，都是重新创建的。
     *      简单来说，就是深复制进行了完全彻底的复制，而浅复制不彻底。
     * @return
     */
    public Object deepClonMyself() throws IOException, ClassNotFoundException {

        /* 写入当前对象的二进制流 */
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);

         /* 读出二进制流产生的新对象 */
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return ois.readObject();
    }

}
