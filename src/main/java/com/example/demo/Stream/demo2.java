package com.example.demo.Stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class demo2 {
    public static void main(String[] args) throws IOException {
        Student stu = new Student("zhangsan",12);

        ObjectOutputStream oss =new ObjectOutputStream(new FileOutputStream("D:\\04_Language\\Java\\demo\\demo\\src\\aa.txt"));
        oss.writeObject(stu);
        oss.close();
    }
}
