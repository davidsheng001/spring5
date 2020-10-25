package cn.pear.spring.test;

import cn.pear.spring.config.SpringConfig;
import cn.pear.spring.dao.CustomDao;
import cn.pear.spring.entity.Custom;
import cn.pear.spring.service.CustomService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    @Test
    public void testDB(){
        ApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);
        Custom custom = new Custom("张三1",1000);
        CustomDao customDao = context.getBean("customDaoImpl",CustomDao.class);
        int res = customDao.add(custom);
        System.out.println(res);
    }

    @Test
    public void testTX(){
        ApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);
        CustomService customService = context.getBean("customService",
                CustomService.class);
        customService.accountMoney();
    }
}
