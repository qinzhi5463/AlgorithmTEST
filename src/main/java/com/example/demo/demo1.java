package com.example.demo;

import java.io.*;


// 定义 Address 类并实现 Serializable 接口
class Address implements Serializable {
    private static final long serialVersionUID = 1L;
    private String street;

    public Address(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return "Address{street='" + street + "'}";
    }
}

// 定义 Person 类并实现 Serializable 接口
class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private Address address;

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    // 深拷贝方法
    public Person deepCopy() {
        try {
            // 将对象序列化为字节流
            ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
            ObjectOutputStream out = new ObjectOutputStream(byteOut);
            out.writeObject(this);
            out.flush();
            out.close();
            byteOut.close();

            // 从字节流中反序列化对象
            ByteArrayInputStream byteIn = new ByteArrayInputStream(byteOut.toByteArray());
            ObjectInputStream in = new ObjectInputStream(byteIn);
            Person copiedPerson = (Person) in.readObject();
            in.close();
            byteIn.close();

            return copiedPerson;
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException("Failed to deep copy object", e);
        }
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', address=" + address + "}";
    }
}

// 测试深拷贝的主程序
public class demo1 {
    public static void main(String[] args) {
        // 创建一个地址对象
        Address address = new Address("123 Main St");

        // 创建一个人对象，并关联地址
        Person Person1 = new Person("John Doe", address);

        // 使用深拷贝方法创建副本
        Person Person2 = Person1.deepCopy();//"John Doe","123 Main St"

        // 修改原对象中的地址
        address = new Address("456 Elm St");
        Person1 = new Person("Jane Doe", address);

        // 打印结果
        System.out.println("Original Person1: " + Person1);
        System.out.println("Copied Person2: " + Person2);
    }
}
