package cn.pear.spring.dao;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class JDKProxy implements InvocationHandler {

    private PersonDao personDao;

    public JDKProxy(PersonDao personDao) {
        this.personDao = personDao;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("增强");
        Object res = method.invoke(personDao,args);
        System.out.println(method);
        System.out.println(personDao);
        System.out.println(args);
        System.out.println(res);
        return res;
    }
}
