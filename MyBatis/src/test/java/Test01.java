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
import java.util.List;
import java.util.Map;

public class Test01 {

    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void getSession(){

        String resource = "mybatis-config.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        sqlSessionFactory =
                new SqlSessionFactoryBuilder().build(inputStream);
    }

    @Test
    public void testSelectById(){
        SqlSession session = sqlSessionFactory.openSession(true);
        EmployeeDao employeeDao = session.getMapper(EmployeeDao.class);
        Employee employee = employeeDao.selectEmpById(1);
        System.out.println(employee);
        session.close();
    }

    @Test
    public void testSelectByIdAndName(){
        SqlSession session = sqlSessionFactory.openSession(true);
        EmployeeDao employeeDao = session.getMapper(EmployeeDao.class);
        Employee employee = employeeDao.selectEmpByIdAndName(1,"张三02");
        System.out.println(employee);
        session.close();
    }

    @Test
    public void testSelect(){
        SqlSession session = sqlSessionFactory.openSession(true);
        EmployeeDao employeeDao = session.getMapper(EmployeeDao.class);
        List<Employee> empList = employeeDao.selectEmp();
        for (Employee emp:empList) {
            System.out.println(emp);
        }
        session.close();
    }

    @Test
    public void testSelectMap(){
        SqlSession session = sqlSessionFactory.openSession(true);
        EmployeeDao employeeDao = session.getMapper(EmployeeDao.class);
        Map<Integer, Employee> empMap = employeeDao.selectEmpMap();
        System.out.println(empMap);
        session.close();
    }

    @Test
    public void testInsert(){
        SqlSession session = sqlSessionFactory.openSession(true);
        EmployeeDao employeeDao = session.getMapper(EmployeeDao.class);
        Employee employee = new Employee();
        employee.setEmpName("李四02");
        employee.setGender(0);
        employee.setEmail("125@qq.com");
        int res = employeeDao.insertEmp(employee);
        System.out.println(res);
        System.out.println(employee);
        session.close();
    }

    @Test
    public void testUpdate(){
        SqlSession session = sqlSessionFactory.openSession(true);
        EmployeeDao employeeDao = session.getMapper(EmployeeDao.class);
        Employee employee = new Employee();
        employee.setId(1);
        employee.setEmpName("张三0");
        int res = employeeDao.updateEmpById(employee);
        System.out.println(res);
        session.close();
    }

    @Test
    public void testDelete(){
        SqlSession session = sqlSessionFactory.openSession(true);
        EmployeeDao employeeDao = session.getMapper(EmployeeDao.class);
        int res = employeeDao.deleteEmpById(2);
        System.out.println(res);
        session.close();
    }
}
