import cn.pear.bean.Teacher;
import cn.pear.dao.TeacherDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test03 {

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
    public void testSelectByCondition(){
        SqlSession session = sqlSessionFactory.openSession(true);
        TeacherDao teacherDao = session.getMapper(TeacherDao.class);
        Teacher teacher = new Teacher();
        teacher.setId(1);
//        teacher.setTeacherName("admin");
        teacher.setCourse("语文");
        Teacher teacher01 = teacherDao.selectByCondition(teacher);
        System.out.println(teacher01);
    }

    @Test
    public void testSelectByList(){
        SqlSession session = sqlSessionFactory.openSession(true);
        TeacherDao teacherDao = session.getMapper(TeacherDao.class);
        List<Teacher> teachers = teacherDao.selectByList(Arrays.asList(1,2,3,4));
        System.out.println(teachers);
    }

    @Test
    public void testSelectByOneCondition(){
        SqlSession session = sqlSessionFactory.openSession(true);
        TeacherDao teacherDao = session.getMapper(TeacherDao.class);
        Teacher teacher01 = new Teacher();
//        teacher01.setId(1);
        teacher01.setTeacherName("张三");
        Teacher teacher02 = teacherDao.selectByOneCondition(teacher01);
        System.out.println(teacher02);
    }

    @Test
    public void testUpdateById(){
        SqlSession session = sqlSessionFactory.openSession(true);
        TeacherDao teacherDao = session.getMapper(TeacherDao.class);
        Teacher teacher01 = new Teacher();
        teacher01.setId(1);
        teacher01.setTeacherGender(1);
        int res = teacherDao.updateById(teacher01);
        System.out.println(res);
    }
}
