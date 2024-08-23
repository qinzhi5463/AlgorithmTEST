package com.example.demo;


class aaa implements Cloneable{
    private String street;
    private int age;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void getAge() {
        System.out.println(this.age);
    }

    public aaa() {
        // 默认的无参构造函数
    }
    public aaa(String street, int age) {
        this.street = street;
        this.age = age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}


public class demo3 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, CloneNotSupportedException {
//        aaa a1 = new aaa("1", 12);
//        a1.getAge();

//        aaa a2 =(aaa)Class.forName("com.example.demo.aaa").newInstance();
//        a2.setAge(17);
//        a2.getAge();
        //com.example.demo.aaa

//        aaa a3= (aaa) a1.clone();
//        a3.setAge(18);
//        a3.getAge();

        Class class1= aaa.class;
        aaa a4 =(aaa) class1.newInstance();
        a4.setAge(20);
        a4.getAge();


//        Class cls = Class.forName("com.example.demo.aaa");
//        Class cls2 = new aaa().getClass();
//
//        System.out.println(cls == cls2); //比较Class对象的地址，输出结果是true


    }
}
