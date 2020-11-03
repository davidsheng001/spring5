import cn.pear.bean.Key;
import cn.pear.bean.Lock;
import cn.pear.dao.KeyDao;
import cn.pear.dao.LockDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class Test02 {

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
    public void testGetById(){
        SqlSession session = sqlSessionFactory.openSession(true);
        KeyDao keyDao = session.getMapper(KeyDao.class);
        Key key = keyDao.getById(2);
        System.out.println(key);
        session.close();
    }

    @Test
    public void testGetLockById(){
        SqlSession session = sqlSessionFactory.openSession(true);
        LockDao lockDao = session.getMapper(LockDao.class);
        Lock lock = lockDao.getLockById(3);
        System.out.println(lock);
        session.close();
    }
}
