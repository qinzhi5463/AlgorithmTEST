package com.example.demo;

public class demo2 {
    public static void main(String[] args) {
        // 创建嵌套对象
        NestedClass nestedObject = new NestedClass();
        nestedObject.setNestedField(42);

        // 创建主对象并设置字段
        MyClass original = new MyClass();
        original.setField1("Hello");
        original.setNestedObject(nestedObject);

        // 进行深拷贝
        MyClass copy = original.deepCopy();

        // 修改原始对象的值
        original.setField1("World");
        original.getNestedObject().setNestedField(100);

        // 打印原始对象和副本对象，验证副本对象未受原始对象修改的影响
        System.out.println("Original object: " + original);
        System.out.println("Copied object: " + copy);
    }
}

class MyClass {
    private String field1;
    private NestedClass nestedObject;

    // Getter and Setter for field1
    public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }

    // Getter and Setter for nestedObject
    public NestedClass getNestedObject() {
        return nestedObject;
    }

    public void setNestedObject(NestedClass nestedObject) {
        this.nestedObject = nestedObject;
    }

    // 深拷贝方法
    public MyClass deepCopy() {
        MyClass copy = new MyClass();
        copy.setField1(this.field1);
        if (this.nestedObject != null) {
            copy.setNestedObject(this.nestedObject.deepCopy());
        }
        return copy;
    }

    @Override
    public String toString() {
        return "MyClass{field1='" + field1 + "', nestedObject=" + nestedObject + "}";
    }
}

class NestedClass {
    private int nestedField;

    // Getter and Setter for nestedField
    public int getNestedField() {
        return nestedField;
    }

    public void setNestedField(int nestedField) {
        this.nestedField = nestedField;
    }

    // 深拷贝方法
    public NestedClass deepCopy() {
        NestedClass copy = new NestedClass();
        copy.setNestedField(this.nestedField);
        return copy;
    }

    @Override
    public String toString() {
        return "NestedClass{nestedField=" + nestedField + "}";
    }
}
