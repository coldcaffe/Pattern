package com.rookie.pattern.prototype.simple;

import java.io.*;
import java.util.List;

/**
 * 浅克隆
 */
public class Concreteprototype implements Prototype, Serializable {

    private String name;

    private Integer age;

    private List hobbies;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List getHobbies() {
        return hobbies;
    }

    public void setHobbies(List hobbies) {
        this.hobbies = hobbies;
    }

    /**
     * 浅克隆,只能复制对象属性值,但当对象中成员也为对象时复制的是该成员对象的引用
     */
    @Override
    public Prototype clone() {
        Concreteprototype concreteprototype = new Concreteprototype();
        concreteprototype.setAge(this.age);
        concreteprototype.setName(this.name);
        concreteprototype.setHobbies(this.hobbies);
        return concreteprototype;
    }

    /**
     * 浅克隆,只能复制对象属性值,但当对象中成员也为对象时复制的是该成员对象的引用
     * 通过写入写出当前对象二进制流的方式实现
     */
    @Override
    public Prototype deepClone() throws IOException, ClassNotFoundException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream obs = new ObjectOutputStream(bos);
        obs.writeObject(this);

        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return (Prototype) ois.readObject();
    }
}
