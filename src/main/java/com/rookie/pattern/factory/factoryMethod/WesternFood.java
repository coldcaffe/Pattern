package com.rookie.pattern.factory.factoryMethod;

public class WesternFood implements Food {

    private FoodType foodType;

    public WesternFood(FoodType foodType) {
        this.foodType = foodType;
    }

    @Override
    public FoodType getFoodType() {
        return foodType;
    }

    @Override
    public String toString() {
        return foodType.getName() + "西餐";
    }
}
