import cn.pear.bean.Employee;
import cn.pear.dao.EmployeeDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class Test01 {

    private SqlSession session;

    @Before
    public void getSession(){

        String resource = "mybatis-config.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory sqlSessionFactory =
                new SqlSessionFactoryBuilder().build(inputStream);
        session = sqlSessionFactory.openSession();
    }

    @Test
    public void testSelect(){
        EmployeeDao employeeDao = session.getMapper(EmployeeDao.class);
        Employee employee = employeeDao.selectEmpById(1);
        System.out.println(employee);
        session.close();
    }

    @Test
    public void testInsert(){
        EmployeeDao employeeDao = session.getMapper(EmployeeDao.class);
        Employee employee = new Employee();
        employee.setEmpName("李四");
        employee.setGender(0);
        employee.setEmail("125@qq.com");
        int res = employeeDao.insertEmp(employee);
        System.out.println(res);
        session.commit();
        session.close();
    }

    @Test
    public void testUpdate(){
        EmployeeDao employeeDao = session.getMapper(EmployeeDao.class);
        Employee employee = new Employee();
        employee.setId(1);
        employee.setEmpName("张三0");
        int res = employeeDao.updateEmpById(employee);
        System.out.println(res);
        session.commit();
        session.close();
    }

    @Test
    public void testDelete(){
        EmployeeDao employeeDao = session.getMapper(EmployeeDao.class);
        int res = employeeDao.deleteEmpById(2);
        System.out.println(res);
        session.commit();
        session.close();
    }
}
