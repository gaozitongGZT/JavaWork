package com.kou;

public class BasketCoach extends Coach{
    public BasketCoach() {
    }

    public BasketCoach(String name,int age){
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("篮球教练教如何打篮球");
    }

    @Override
    public void eat() {
        System.out.println("篮球教练吃");
    }
}
