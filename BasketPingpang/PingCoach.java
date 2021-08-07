package com.kou;

public class PingCoach extends Coach implements Study{
    public PingCoach() {
    }

    public PingCoach(String name,int age){
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("乒乓球教练喝粥");
    }

    @Override
    public void teach() {
        System.out.println("乒乓球教练教打乒乓球");
    }

    @Override
    public void studyenglish() {
        System.out.println("乒乓球教练学习说英语");
    }
}
