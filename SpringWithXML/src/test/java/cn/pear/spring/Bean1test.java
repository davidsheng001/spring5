package cn.pear.spring;

import cn.pear.spring.dao.PersonDao;
import cn.pear.spring.entity.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Bean1test {
    @Test
    public void testJdbcTemplate(){
        ApplicationContext context = new
                ClassPathXmlApplicationContext("bean1.xml");
        Person person = new Person();
        PersonDao personDao = context.getBean("personDao",PersonDao.class);
        person.setName("关羽1");
        person.setAge(100);
        personDao.add(person);
    }
}
