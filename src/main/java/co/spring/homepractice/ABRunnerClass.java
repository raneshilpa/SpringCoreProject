package co.spring.homepractice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ABRunnerClass {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("classpath:ABbeans.xml");
        AClass aref = context.getBean("aref", AClass.class);
        System.out.println(aref);
        System.out.println("x="+aref.getX());
        System.out.println("y from Bclass="+aref.getOb().getY());


    }
}
