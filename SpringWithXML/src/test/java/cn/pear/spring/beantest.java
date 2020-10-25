package cn.pear.spring;

import cn.pear.spring.dao.PersonDao;
import cn.pear.spring.dao.PersonDaoImpl;
import cn.pear.spring.dao.UserDao;
import cn.pear.spring.entity.Classes;
import cn.pear.spring.entity.LifeCycle;
import cn.pear.spring.entity.Person;
import cn.pear.spring.entity.User;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class beantest {

    private AbstractApplicationContext context;
    @Before
    public void before(){
        context =
                new ClassPathXmlApplicationContext("bean.xml");
    }

    @Test
    public void testBean1(){
        User user = (User) context.getBean("user");
        User user1 = context.getBean("user1", User.class);
        User user2 = context.getBean("user2", User.class);
        User user3 = context.getBean("user3", User.class);
        System.out.println(user);
        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
    }

    @Test
    public  void testBean2(){
        UserDao userDao = context.getBean("userDao", UserDao.class);
        UserDao userDao1 = context.getBean("userDao1", UserDao.class);
        UserDao userDao2 = context.getBean("userDao2", UserDao.class);
        userDao.addUser();
        userDao1.addUser();
        userDao2.addUser();
    }

    @Test
    public void testBean3(){
        Classes c = context.getBean("classes", Classes.class);
        System.out.println(c);
    }

    @Test
    public void testLifeCycle(){
        LifeCycle lifeCycle = context.getBean("lifeCycle",
                LifeCycle.class);
        System.out.println("4、得到bean");
        System.out.println(lifeCycle);
    }

    @Test
    public void testAutowire(){
        UserDao userDao3 = context.getBean("userDao3", UserDao.class);
        userDao3.addUser();
    }

//    @Test
//    public void testAop(){
//        PersonDao personDao = context.getBean("personDao", PersonDao.class);
//        Person person = new Person();
//        int res = personDao.add(person);
//        System.out.println(res);
//    }


    @After
    public void after(){
        context.close();
    }
}
