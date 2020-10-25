package cn.pear.spring.dao;

import cn.pear.spring.entity.Person;

import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) {
        Class[] interfaces = {PersonDao.class};
        PersonDao personDao = new PersonDaoImpl();
        JDKProxy jdkProxy = new JDKProxy(personDao);
        personDao = (PersonDao) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(),
                interfaces,jdkProxy);
        personDao.add(new Person());
    }
}
