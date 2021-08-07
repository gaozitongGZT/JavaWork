package com.wei;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {
        //创建集合，储存数据
        ArrayList<Student> array = new ArrayList<>();

        //循环完成回到主界面
        while(true){
            System.out.println("------欢迎来到学生管理系统------");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生信息");
            System.out.println("4.查看所有学生");
            System.out.println("5.退出");
            System.out.print("请输入你的选择：");

            //接收数据
            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();

            //swich完成选择
            switch(line){
                case "1":
                    addStudent(array);
                    break;
                case "2":
                    deleteStudent(array);
                    break;
                case "3":
                    updateStudent(array);
                    break;
                case "4":
                    findAllStudents(array);
                    break;
                case "5":
                    System.out.println("感谢你的使用");
                    System.exit(0);//退出虚拟机
            }
        }


    }
    /*public static void addStudent(ArrayList<Student> array){
        //录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生学号：");
        String sid = sc.nextLine();
        System.out.println("请输入学生姓名：");
        String name = sc.nextLine();
        System.out.println("请输入学生年龄：");
        String age = sc.nextLine();
        System.out.println("请输入学生居住地：");
        String address = sc.nextLine();

        Student s = new Student();
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);

        array.add(s);

    }*/

    //录入信息
    public static void addStudent(ArrayList<Student> array){
        Scanner sc = new Scanner(System.in);
        String sid;
        while(true){
            System.out.println("请输入学生学号：");
            sid = sc.nextLine();
            boolean flag = isUsed(array,sid);
            if(flag == true){
                System.out.println("您输入的学号已经被使用，请重新输入");
            }else{
                break;
            }
        }
        System.out.println("请输入学生姓名：");
        String name = sc.nextLine();
        System.out.println("请输入学生年龄：");
        String age = sc.nextLine();
        System.out.println("请输入学生居住地：");
        String address = sc.nextLine();

        Student s = new Student();
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);

        //添加操作
        array.add(s);

        //提示成功
        System.out.println("添加学生成功");


    }

    //查重
    public static boolean isUsed(ArrayList<Student> array, String sid){

        boolean flag = false;
        for (int i = 0;i<array.size();i++){
            Student s = array.get(i);
            if (s.getSid().equals(sid)){
                flag = true;
                break;
            }
        }
        return flag;
    }

    //删除方法
    public static void deleteStudent(ArrayList<Student> array){
        //录入信息
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除的学生学号");
        String sid = sc.nextLine();

        //删除前判断学号是否存在
        int index = -1;
        for (int i = 0;i < array.size();i++){
            Student s = array.get(i);
            if (s.getSid().equals(sid)){
                index = i;
                break;
            }
        }

        if (index == -1){
            System.out.println("该学生信息不存在，请重新输入");
        }else {
            array.remove(index);
            System.out.println("删除学生信息成功");

        }
    }

    //修改信息
    public static void updateStudent(ArrayList<Student> array){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要修改的学生学号：");
        String sid = sc.nextLine();

        //输入信息
        System.out.println("请输入学生新姓名：");
        String name = sc.nextLine();
        System.out.println("请输入学生新年龄：");
        String age = sc.nextLine();
        System.out.println("请输入学生新住址：");
        String address = sc.nextLine();

        //创建学生对象
        Student s = new Student();
        s.setAddress(address);
        s.setAge(age);
        s.setName(name);
        s.setSid(sid);

        //遍历集合修改对应的学生信息
        for (int i = 0;i < array.size();i++){
            Student student = array.get(i);
            if (student.getSid().equals(sid)){
               array.set(i,s);
               break;
            }
        }
        //成功提示
        System.out.println("修改学生信息成功！");
    }

    //查看所有信息
    public static void findAllStudents(ArrayList<Student> array){
        //判断是否有信息
        if (array.size() == 0){
            System.out.println("无信息，请先添加信息进行查询");
            return;
        }

        //输出信息
        //   \t---缩进
        System.out.println("学号\t\t\t姓名\t\t\t年龄\t\t\t居住地");
        //将信息格式化，变美观
//        for (Student s: array ){
//        }
        for (int i = 0;i < array.size();i++){
            Student s = array.get(i);
            String sid = s.getSid();
            String name = s.getName();
            String age = s.getAge();
            String address = s.getAddress();
            System.out.println(sid + "\t\t" + name +"\t\t\t" + age +"\t\t\t"+ address);

        }
    }
}
