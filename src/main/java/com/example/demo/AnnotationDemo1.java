package com.example.demo;

import org.junit.Test;

@MyTest3(value = "jjjj",aaa = 99,bbb = {"bbb","ccc"})
public class AnnotationDemo1 {


    public  int age;


    @MyTest3(value = "3333",aaa = 299,bbb = {"dddd","ccc"})
    public void test1(){
        System.out.println("t1111111111111");
    }
    @MyTest3(value = "3333",aaa = 299,bbb = {"dddd","ccc"})
    public void test2(){
        System.out.println("t2222222222222");
    }
    public void test3(){
        System.out.println("t3333333333333");
    }

    @MyTest3(value = "3333",aaa = 299,bbb = {"dddd","ccc"})
    public void test4(){
        System.out.println("t44444444444444");
    }

}
