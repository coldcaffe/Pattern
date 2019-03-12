package com.rookie.pattern.factory.factoryMethod;

public class ChineseFood implements Food {

    private FoodType foodType;

    public ChineseFood(FoodType foodType) {
        this.foodType = foodType;
    }

    @Override
    public FoodType getFoodType() {
        return foodType;
    }

    @Override
    public String toString() {
        return foodType.getName() + "中餐";
    }
}
