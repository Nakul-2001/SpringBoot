package com.sharma.nakul;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NakulApplication {

	public static void main(String[] args) {
		SpringApplication.run(NakulApplication.class, args);
		MyFirstClass myFirstClass = new MyFirstClass();
		myFirstClass.sayHello();
	}

}
