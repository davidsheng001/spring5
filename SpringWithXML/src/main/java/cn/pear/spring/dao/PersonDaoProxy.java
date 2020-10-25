package cn.pear.spring.dao;

import org.aspectj.lang.ProceedingJoinPoint;

public class PersonDaoProxy {

    public void  proxyMethod(){
        System.out.println("前置通知");
    }

    public int around(ProceedingJoinPoint proceedingJoinPoint){
        System.out.println("环绕前");
        int res = 0;
        try {
            res = (Integer) proceedingJoinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("环绕后");
        return res;
    }
}
