import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

import javax.sql.DataSource;
import java.sql.SQLException;

public class TestConnection {
    public static void main(String[] args) {
        ApplicationContext ap = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
        DataSource datasource = ap.getBean("dataSource", DataSource.class);
        try {
            System.out.println(datasource.getConnection());
        } catch (SQLException e) {
            e.printStackTrace();
        }

//        stringRedisTemplate.opsForValue().set("232", "kekeke");
//        String s = stringRedisTemplate.opsForValue().get("232");
//        System.out.println(s);
//        System.out.println(s);

    }
}
