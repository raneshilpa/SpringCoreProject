package co.spring.homepractice.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {

    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("classpath:autowiringbean.xml");
        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp);
        



    }
}
