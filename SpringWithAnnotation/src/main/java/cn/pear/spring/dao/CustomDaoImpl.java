package cn.pear.spring.dao;

import cn.pear.spring.entity.Custom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CustomDaoImpl implements CustomDao{
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public int add(Custom custom) {
        String sql = "insert into custom values(null,?,?)";
        Object[] args = {custom.getcName(),custom.getcMoney()};
        int res = jdbcTemplate.update(sql,args);
        return res;
    }

    @Override
    public int delete() {
        return 0;
    }

    @Override
    public int update() {
        return 0;
    }

    @Override
    public int reduceMoney() {
        String sql = "update custom set cmoney=? where cid=?";
        int res = jdbcTemplate.update(sql,900,1);
        return res;
    }

    @Override
    public int increaseMoney() {
        String sql = "update custom set cmoney=? where cid=?";
        int res = jdbcTemplate.update(sql,1100,2);
        return res;
    }
}
