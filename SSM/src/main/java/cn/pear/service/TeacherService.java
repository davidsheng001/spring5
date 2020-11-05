package cn.pear.service;

import cn.pear.bean.Teacher;
import cn.pear.dao.TeacherMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {

    @Autowired
    private TeacherMapper teacherMapper;

    public List<Teacher> getAll(){
        return teacherMapper.selectAll();
    }

}
