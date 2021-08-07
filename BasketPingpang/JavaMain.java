package com.kou;



public class JavaMain {
    public static void main(String[] args) {

        BasketPlayer bp = new BasketPlayer();

        bp.setAge(30);
        bp.setName("林书豪");

        System.out.println(bp.getName() + "," + bp.getAge());
        bp.study();
        bp.eat();

        PingPlayer pp = new PingPlayer();
        pp.setName("马龙");
        pp.setAge(25);

        System.out.println(pp.getName() + "," + pp.getAge());
        pp.eat();
        pp.study();
        pp.studyenglish();

    }
}
