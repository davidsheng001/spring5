package cn.pear.spring.dao;

import cn.pear.spring.entity.Person;

public interface PersonDao {
    int add(Person person);
    int remove();
    int update();
}
