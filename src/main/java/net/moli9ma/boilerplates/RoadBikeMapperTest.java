package net.moli9ma.boilerplates;

import org.apache.ibatis.exceptions.PersistenceException;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class RoadBikeMapperTest {

    public static void main(String[] args) {
        String resource = "mybatisConfig.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {

            RoadBikeMapper mapper = sqlSession.getMapper(RoadBikeMapper.class);
            RoadBike roadBike = new RoadBike();
            roadBike.setName("ridley fenix al");
            mapper.insert(roadBike);

            System.out.println(roadBike.getId());
            sqlSession.commit();
        } catch (PersistenceException e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }
}
