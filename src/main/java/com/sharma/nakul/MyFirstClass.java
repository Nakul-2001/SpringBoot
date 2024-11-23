package com.sharma.nakul;

public class MyFirstClass {

    private final String firstName;
    private final String lastName;

    public MyFirstClass(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String sayHello() {
        return "Hello " + firstName + " " + lastName;
    }
    
}
