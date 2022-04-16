package co.spring.homepractice.beanlifecycle;

import com.sun.security.jgss.GSSUtil;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SamosaRunner {
    public static void main(String[] args) {
        AbstractApplicationContext context= new ClassPathXmlApplicationContext("classpath:samosabean.xml");
        Samosa samosa1price = context.getBean("samosa1", Samosa.class);
        System.out.println(samosa1price);
        context.registerShutdownHook();
        System.out.println("=================================");
        Pepsi pepsiprice = context.getBean("p1", Pepsi.class);
        System.out.println(pepsiprice);


    }
}
