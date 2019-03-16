package com.rookie.pattern.proxy.staticProxy;

public class Father {

    private Person person;

    public Father(Person person) {
        this.person = person;
    }

    public void findLove() {
        System.out.println("父亲给儿子找对象");
        this.person.findLove();
        System.out.println("同意了,双方父母见面");
    }
}
