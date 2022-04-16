package co.spring.homepractice.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStandalone {

    public static void main(String[] args) {
        ApplicationContext context =new ClassPathXmlApplicationContext("classpath:standalonecollectionbean.xml");
        Person person1 = context.getBean("person1", Person.class);
        System.out.println(person1);
        System.out.println(person1.getFriends().getClass().getName());
        System.out.println("========================");
        System.out.println(person1.getFeeStructure());
        System.out.println(person1.getFeeStructure().getClass().getName());
    }
}
