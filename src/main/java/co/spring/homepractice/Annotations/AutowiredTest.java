package co.spring.homepractice.Annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowiredTest {
    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:autowiredAnnotation.xml");
//        Employee employee = context.getBean("employee", Employee.class);
//        System.out.println("Emp Id "+employee.getId());
//        System.out.println("Emp Name "+employee.getName());
//        System.out.println("Emp Address:  "+employee.getAddress().getStreet()+" "+employee.getAddress().getCity()+" "+employee.getAddress().getState());
//


        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:component.xml");
        Employee_Component employee = context.getBean("emp", Employee_Component.class);
        System.out.println("Emp Id "+employee.getId());
        System.out.println("Emp Name "+employee.getName());
        System.out.println("Emp Address:  "+employee.getAddress_component().getStreet()+" "+employee.getAddress_component().getCity()+" "+employee.getAddress_component().getState());




    }
}
