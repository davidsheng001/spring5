package cn.pear.spring.service;

import cn.pear.spring.dao.CustomDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CustomService {
    @Autowired
    private CustomDao customDao;

    @Transactional
    public void accountMoney(){
        customDao.reduceMoney();
        int i = 10/0;
        customDao.increaseMoney();
    }
}
