package com.rookie.pattern.factory.factoryMethod;

public class ChineseCook implements Cook {

    @Override
    public Food cookFood(FoodType foodType) {
        return new ChineseFood(foodType);
    }
}
