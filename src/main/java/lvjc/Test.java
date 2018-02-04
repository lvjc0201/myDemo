package lvjc;

import lvjc.model.User;
import lvjc.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-config.xml");
        UserService userService= (UserService) applicationContext.getBean("userService");
        int a = userService.insertUser(new User("qwe","qwe"));
        System.out.println(a);
    }
}
