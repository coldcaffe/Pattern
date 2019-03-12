package com.rookie.pattern.factory.factoryMethod;

public class WesterCook implements Cook {


    @Override
    public Food cookFood(FoodType foodType) {
        return new WesternFood(foodType);
    }
}
