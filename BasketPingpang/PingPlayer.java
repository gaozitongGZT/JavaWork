package com.kou;

public class PingPlayer extends Athletes implements Study{
    public PingPlayer() {
    }

    public PingPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("乒乓球运动员吃咸菜");
    }

    @Override
    public void study() {
        System.out.println("乒乓球运动员学习乒乓球");
    }

    @Override
    public void studyenglish() {
        System.out.println("乒乓球运动员学习说英语");
    }
}
