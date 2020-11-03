package cn.pear.dao;

import cn.pear.bean.Employee;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface EmployeeDao {

    Employee selectEmpById(int id);

    Employee selectEmpByIdAndName(@Param("id") int id, @Param("empName") String empName);

    List<Employee> selectEmp();

    @MapKey("id")
    Map<Integer,Employee> selectEmpMap();

    int deleteEmpById(int id);

    int insertEmp(Employee employee);

    int updateEmpById(Employee employee);
}
