package lvjc; 

import lvjc.model.User;
import lvjc.service.UserService;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/** 
* Test Tester. 
* 
* @author <Authors name> 
* @since <pre>һ�� 31, 2018</pre> 
* @version 1.0 
*/ 
public class TestTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: main(String[] args) 
* 
*/ 
@Test
public void testMain() throws Exception {
    ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-config.xml");
    UserService userService= (UserService) applicationContext.getBean("userService");
    int a = userService.insertUser(new User("qwe","qwe"));
    System.out.println(a);
}


} 
