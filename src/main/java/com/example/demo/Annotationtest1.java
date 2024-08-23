package com.example.demo;

import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Annotationtest1 {
//
//    @Test
//    public void parseclass() {
//        //通过反射，，拿注解
//        Class class1 = AnnotationDemo1.class;
//        if (class1.isAnnotationPresent(MyTest3.class)) {
//            MyTest3 mytest3 = (MyTest3) class1.getDeclaredAnnotation(MyTest3.class);
//            System.out.println(mytest3.value());
//            System.out.println(mytest3.aaa());
//        }
//
//    }
//
//
//    @Test
//    public void parseMethod() throws NoSuchMethodException {
//        //通过反射，，拿注解
//        Class class1 = AnnotationDemo1.class;
//        Method test = class1.getDeclaredMethod("test");
//        if (class1.isAnnotationPresent(MyTest3.class)) {
//            MyTest3 mytest3 = (MyTest3) test.getDeclaredAnnotation(MyTest3.class);
//            System.out.println(mytest3.value());
//            System.out.println(mytest3.aaa());
//        }
//
//    }

    public static void main(String[] args) throws Exception {
        AnnotationDemo1 a = new AnnotationDemo1();
        Class c = AnnotationDemo1.class;

        Method[] methods = c.getDeclaredMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(MyTest3.class)) {
                method.invoke(a);
            }
        }
    }
}
