package com.mina;

public class Student {
        String id;
        String name;
        int math;
        int english;
    public Student(String id ,String name, int math ,int english){
        this.id = id;
        this.name = name;
        this.math = math;
        this.english = english;


    }
    public Student(){
        super();
    }
    public void print(){
        System.out.println(id + "\t" +name +"\t" +math+english);
    }

}
