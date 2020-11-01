package cn.pear.dao;

import cn.pear.bean.Employee;

public interface EmployeeDao {

    Employee selectEmpById(int id);

    int deleteEmpById(int id);

    int insertEmp(Employee employee);

    int updateEmpById(Employee employee);
}
