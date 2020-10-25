package cn.pear.spring.entity;

public class User {
    private String userName;
    private int userAge;
    private int money;

    public User() {
    }

    public User(String userName, int userAge, int money) {
        this.userName = userName;
        this.userAge = userAge;
        this.money = money;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", userAge=" + userAge +
                ", money=" + money +
                '}';
    }
}
