package com.lian;

public class digui {
    public static void main(String[] args) {

        int a = math(5);
        System.out.println("结果是" + a);

    }

    //定义递归求阶乘
    public  static int math(int i){
        if (i== 1){
            return 1;
        }else {
            return i * math(i-1);
        }

    }
}
