package co.spring.homepractice.ConInject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonRunner {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("classpath:personbeans.xml");
        Person person = context.getBean("person", Person.class);
        System.out.println(person);
    }
}
