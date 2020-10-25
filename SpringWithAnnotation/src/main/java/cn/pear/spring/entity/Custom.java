package cn.pear.spring.entity;

public class Custom {

    private String cName;
    private int cMoney;

    public Custom(String cName, int cMoney) {
        this.cName = cName;
        this.cMoney = cMoney;
    }

    public String getcName() {
        return cName;
    }

    public int getcMoney() {
        return cMoney;
    }
}
