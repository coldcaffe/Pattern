package com.rookie.pattern.factory.factoryMethod;

public class Application {
    private final Cook cook;

    public Application(Cook cook) {
        this.cook = cook;
    }

    private void makeFood() {
        Food food;
        food = cook.cookFood(FoodType.COLD);
        System.out.println(food);
        food = cook.cookFood(FoodType.HOT);
        System.out.println(food);
    }

    public static void main(String[] args) {
        Application app = new Application(new WesterCook());
        app.makeFood();
        app = new Application(new ChineseCook());
        app.makeFood();
    }
}
