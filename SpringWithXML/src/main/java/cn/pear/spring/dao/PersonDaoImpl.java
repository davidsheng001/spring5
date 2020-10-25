package cn.pear.spring.dao;

import cn.pear.spring.entity.Person;
import org.springframework.jdbc.core.JdbcTemplate;

public class PersonDaoImpl implements PersonDao{
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int remove() {
        return 0;
    }

    @Override
    public int update() {
        String sql = "update person set name = ? where id = ?";
        Object[] args = {"王五",1};
        int res = jdbcTemplate.update(sql,args);
        return res;
    }

    @Override
    public int add(Person person) {
        String sql = "insert into person values(null,?,?)";
        Object[] args = {person.getName(),person.getAge()};
        int res = jdbcTemplate.update(sql,args);
        return res;
    }
}
