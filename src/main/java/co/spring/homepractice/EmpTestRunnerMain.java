package co.spring.homepractice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpTestRunnerMain {
    public static void main(String[] args) {

        ApplicationContext context  =new ClassPathXmlApplicationContext("classpath:collectionbeans.xml");
        EmpCollection empbean = context.getBean("emp1", EmpCollection.class);
        System.out.println(empbean.getName());
        System.out.println(empbean.getPhones());
        System.out.println(empbean.getAddresses());
        System.out.println(empbean.getCourses());
    }
}
