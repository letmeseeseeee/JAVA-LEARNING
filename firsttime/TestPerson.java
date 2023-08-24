package com.company;
public class TestPerson {
    public static void daffodilThree(){
        for(int i=100;i<=999;i++){
            int a=i/100;
            int b=i/10%10;
            int c=i%10;
            if(i==a*a*a+b*b*b+c*c*c){
                System.out.println(i);
            }
        }
    }
    public static  void main(String[] args){
        Person person=new Person(11,"libohui");
        //实例化一个Person类的对象
        person.display();
        daffodilThree();
        //调用水仙花方法
    }
}
