//package com.example.demo;
//
//
//import java.io.*;
//
//class aaa implements Serializable {
//    private static final long serialVersionUID = 1L;
//
//    private String street;
//    private int age;
//
//    public aaa() {
//        // 默认的无参构造函数
//    }
//
//    public aaa(String street, int age) {
//        this.street = street;
//        this.age = age;
//    }
//
//    public String getStreet() {
//        return street;
//    }
//
//    public void setStreet(String street) {
//        this.street = street;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    @Override
//    public String toString() {
//        return "aaa{street='" + street + "', age=" + age + "}";
//    }
//}
//public class Serializable_demo4 {
//
//    public static void main(String[] args) {
//        // 打印当前工作目录
//        System.out.println("Current working directory: " + System.getProperty("user.dir"));
//
//        // 创建原始对象
//        aaa original = new aaa("Main Street", 25);
//
//        // 序列化对象到文件
//        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("object.ser"))) {
//            out.writeObject(original);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        // 反序列化对象从文件
//        aaa deserialized = null;
//        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("object.ser"))) {
//            deserialized = (aaa) in.readObject();
//        } catch (IOException | ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//
//        // 打印反序列化的对象
//        if (deserialized != null) {
//            System.out.println("Deserialized object: " + deserialized);
//        }
//    }
//}
