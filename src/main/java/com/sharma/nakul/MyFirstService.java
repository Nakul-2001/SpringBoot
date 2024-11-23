package com.sharma.nakul;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MyFirstService {

//    1
//    MyFirstClass myFirstClass;
//    @Autowired
//    public MyFirstService(MyFirstClass myFirstClass) {
//        this.myFirstClass = myFirstClass;
//    }

//    2
//    MyFirstClass myFirstClass;
//    public MyFirstService(MyFirstClass myFirstClass) {
//        this.myFirstClass = myFirstClass;
//    }

//    3
    @Autowired
    @Qualifier("third")
    MyFirstClass myFirstClass;

    public void hello() {
         System.out.println(myFirstClass.sayHello());
    }
}
