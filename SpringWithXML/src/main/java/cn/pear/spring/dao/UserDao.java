package cn.pear.spring.dao;

import cn.pear.spring.entity.User;

public class UserDao {

    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void addUser(){
        System.out.println("add user: "+this.user);
    }
}
