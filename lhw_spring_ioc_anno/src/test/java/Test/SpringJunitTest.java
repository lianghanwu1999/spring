package Test;

/**
 * @Author LiangHanWu
 * @Date 2021-06-05 16:20
 * @Version 1.0
 */

import com.lhw.config.SpringCofiguration;
import com.lhw.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.sql.SQLException;

//使用@Runwith注解替换原来的运行期
@RunWith(SpringJUnit4ClassRunner.class)   //使用这个集成来帮忙进行初始
//使用@ContextConfiguration获取xml的spring容器，指定配置文件或配置类
//@ContextConfiguration("classpath:applicationContext3.xml")

//使用@ContextConfiguration获取全注解加载配置类的spring容器，指定配置文件或配置类
@ContextConfiguration(classes = {SpringCofiguration.class})
public class SpringJunitTest {

    @Autowired  //按照数据类型从spring容器中进行自动匹配依赖
    private UserService userService;

    @Autowired
    private DataSource dataSource;

    @Test
    public void test1() throws SQLException {
        userService.save();
        System.out.println(dataSource.getConnection());
    }

}
