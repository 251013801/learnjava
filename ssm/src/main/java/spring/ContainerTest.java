package spring;

import beans.User;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;
import service.UserService;

@Component
public class ContainerTest {

    @Autowired
    User u;

    public static void main(String[] args) {
//        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("beans.xml"));
//
//        Object test = beanFactory.getBean("test");
//
//        System.out.println(test);
//
//        ContainerTest containerTest = (ContainerTest)beanFactory.getBean("containerTest");
//        System.out.println(containerTest.u);
//        System.out.println(beanFactory.getBean("user"));

        ApplicationContext context =new ClassPathXmlApplicationContext("beans.xml");
        ContainerTest containerTest1 = (ContainerTest)context.getBean("containerTest");
        System.out.println(containerTest1.u);
        System.out.println(context.getBean("beanLifeTest"));
        System.out.println("ApplicationContext close!");
        ((ClassPathXmlApplicationContext) context).close();

//        UserService userService = (UserService) beanFactory.getBean("userService");
//
//        System.out.println(userService);
    }
}
