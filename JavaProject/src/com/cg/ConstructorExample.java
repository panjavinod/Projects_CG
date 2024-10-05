package com.cg;

class MyClass {
    private int value;

    // Constructor
    public MyClass(int value) {
        this.value = value;
        System.out.println("Constructor called. Value set to: " + this.value);
    }

    public int getValue() {
        return value;
    }
}

public class ConstructorExample {
    public static void main(String[] args) {
        MyClass obj = new MyClass(42); // Constructor called. Value set to: 42
        System.out.println("Value of the object: " + obj.getValue()); // Output: Value of the object: 42
    }
}

