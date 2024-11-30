package com.sharma.nakul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

		//1)Basic approach of making object and calling its function. (Without use of spring dependency injection).
//@SpringBootApplication
//public class NakulApplication {
//
//	public static void main(String[] args) {
//		SpringApplication.run(NakulApplication.class, args);
//
//		MyFirstClass myFirstClass = new MyFirstClass();
//		System.out.println(myFirstClass.sayHello());
//
//	}
//
//}

		//2) Approach of defining bean of class and getting it from ConfigurableApplicationContext(var x) using getBean() method.
//@SpringBootApplication
//public class NakulApplication {
//
//	public static void main(String[] args) {
//		var x = SpringApplication.run(NakulApplication.class, args);
//		MyFirstClass myFirstClass = x.getBean(MyFirstClass.class);
//		System.out.println(myFirstClass.sayHello());
//
//	}
//
//	@Bean
//	MyFirstClass myFirstClass() {
//		return new MyFirstClass();
//	}
//
//}

//		3): Here no need to use @bean instead mark the class with @Component/@Service/@Repository where it is defined.
//@SpringBootApplication
//public class NakulApplication {
//
//	public static void main(String[] args) {
//		var x = SpringApplication.run(NakulApplication.class, args);
//		MyFirstClass myFirstClass = x.getBean(MyFirstClass.class);
//		System.out.println(myFirstClass.sayHello());
//
//	}
//
//}

//		4) way is to define all the bean in ApplicationConfig file.
//		Bean naming is also performed here.
//@SpringBootApplication
//public class NakulApplication {
//
//	public static void main(String[] args) {
//		var x = SpringApplication.run(NakulApplication.class, args);
//		MyFirstClass myFirstClass = x.getBean("myBean",MyFirstClass.class);
//		System.out.println(myFirstClass.sayHello());
//
//	}
//
//}

//@SpringBootApplication
//public class NakulApplication {
//
//	public static void main(String[] args) {
//		var ctx = SpringApplication.run(NakulApplication.class, args);
//		MyFirstService myFirstService = ctx.getBean(MyFirstService.class);
//		myFirstService.hello();
//	}
//
//}

@SpringBootApplication
public class NakulApplication {

	public static void main(String[] args) {
		SpringApplication.run(NakulApplication.class, args);
	}

}

