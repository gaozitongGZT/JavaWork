package com.kou;

public class BasketPlayer extends Athletes{
    public BasketPlayer() {
    }

    public BasketPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {

    }

    @Override
    public void eat() {
        System.out.println("篮球运动员吃熊掌");
    }

}
