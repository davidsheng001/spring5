import cn.pear.bean.Teacher;
import cn.pear.dao.TeacherMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Test01 {

    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void getFactory(){
        String resource = "mybatis/mybatis-config.xml";
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
    public void testInsertAll(){
        SqlSession session = sqlSessionFactory.openSession(true);
        TeacherMapper teacherMapper = session.getMapper(TeacherMapper.class);
        Teacher teacher = new Teacher();
        List<Teacher> teachers = new ArrayList<>();
        for (int i=1;i<1000;i++){
            teacher.setTeacherName(UUID.randomUUID().toString().substring(0,5));
            teacher.setCourse(UUID.randomUUID().toString().substring(0,5));
            teachers.add(teacher);
        }
        teacherMapper.insertMany(teachers);
        session.close();
    }
}
