package co.spring.learning.springdemo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;


//@SpringBootApplication

public class SpringDemoApplication {

	public static void main(String[] args) {

		//SpringApplication.run(SpringDemoApplication.class, args);
      // Car car = new Car("HONDA","CRV",()->"Electric Engine");
		ApplicationContext context = new FileSystemXmlApplicationContext("classpath:beans.xml");
		Car car = context.getBean("car", Car.class);
		System.out.println(car);
		System.out.println(context.getBean("user", User.class));


	}


}
//@Data
//@Builder
//@NoArgsConstructor
//@AllArgsConstructor
//class User
//{
//	private String firstName;
//	private String lastName;
//	private String courseName;
//}
