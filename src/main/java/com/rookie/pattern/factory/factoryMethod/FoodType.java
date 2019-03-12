package com.rookie.pattern.factory.factoryMethod;

/**
 * 食物类型
 */
public enum FoodType {
    HOT("热的"), COLD("冷的");
    private String name;

    FoodType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
