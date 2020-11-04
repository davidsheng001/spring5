package cn.pear.dao;

import cn.pear.bean.Teacher;

import java.util.List;

public interface TeacherDao {

    Teacher selectByCondition(Teacher teacher);

    List<Teacher> selectByList(List<Integer> ids);

    Teacher selectByOneCondition(Teacher teacher);

    int updateById(Teacher teacher);
}
