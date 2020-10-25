package cn.pear.spring.dao;

import cn.pear.spring.entity.Custom;

public interface CustomDao {

    int add(Custom custom);
    int delete();
    int update();
    int reduceMoney();
    int increaseMoney();
}
