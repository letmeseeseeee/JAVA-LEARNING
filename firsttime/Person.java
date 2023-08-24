package com.company;

public class Person {
    String name;
    int id;
    public Person(){
        //无参构造函数
    }

    public Person(int id,String name){
        this.id=id;
        this.name=name;
        //有参构造函数
    }
    public String toString(){
        return "id:"+this.id+" name:"+this.name;
    }
    public void display(){
        System.out.println(this.toString());
    }

}
