package com.example.myproject;

public class Person {
    public String greet(String name, int id) {
        if (name.equals("ram") && id == 3025) {
            return "Hello, Ram!";
        } else {
            return "Invalid input!";
        }
    }
}
