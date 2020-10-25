package cn.pear.spring.entity;

public class LifeCycle {
    private String name;

    public LifeCycle() {
        System.out.println("1、构造方法");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("2、属性赋值");
    }
    private void init(){
        System.out.println("3、初始化");
    }

    private void destroy(){
        System.out.println("5、销毁");
    }
}
