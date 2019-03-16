package com.rookie.pattern.test.prototype.simple;

import com.rookie.pattern.prototype.simple.Client;
import com.rookie.pattern.prototype.simple.Concreteprototype;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PrototypeTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        /**
         * 浅克隆,克隆的是应用对象地址而不是值(常用,但存在风险)
         */
        Concreteprototype concreteprototype = new Concreteprototype();
        concreteprototype.setName("如花");
        concreteprototype.setAge(18);
        List hobbies = new ArrayList();
        concreteprototype.setHobbies(hobbies);

        Client client = new Client();
        Concreteprototype copy = (Concreteprototype) client.shallowClone(concreteprototype);
        System.out.println("克隆对象中引用类型地址的值: " + copy.getHobbies());
        System.out.println("源对象中引用类型地址的值: " + concreteprototype.getHobbies());
        System.out.println("对象地址比较: " + (copy.getHobbies() == concreteprototype.getHobbies()));

        System.out.println(">>>>>>>>>>>>>>>>>> 分隔符 <<<<<<<<<<<<<<<<<<");

        /**
         * 深克隆可复制对象中的对象引用
         */
        Concreteprototype copy1 = (Concreteprototype) client.deepClone(concreteprototype);
        System.out.println("克隆对象中引用类型地址的值: " + copy1.getHobbies());
        System.out.println("源对象中引用类型地址的值: " + concreteprototype.getHobbies());
        System.out.println("对象地址比较: " + (copy1.getHobbies() == concreteprototype.getHobbies()));

    }
}
