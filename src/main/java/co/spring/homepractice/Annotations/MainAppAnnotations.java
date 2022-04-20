package co.spring.homepractice.Annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAppAnnotations
{
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:annotation.xml");
        Student student = context.getBean("student", Student.class);
        System.out.println("Student Name:"+student.getName());
        System.out.println("Student age :"+student.getAge());





    }
}
