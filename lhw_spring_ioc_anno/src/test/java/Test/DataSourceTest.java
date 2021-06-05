package Test;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ResourceBundle;

/**
 * @Author LiangHanWu
 * @Date 2021-06-04 17:35
 * @Version 1.0
 */

/**
 * 测试spring容器的类
 */
public class DataSourceTest {




    /**
     * 测试spring容器(applicationContext.xml)产生数据源对象(c3p0 和 druid)
     */
    @Test
    public void test4() throws Exception{
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取spring容器对象实例
        DataSource dataSource = app.getBean(DataSource.class);
        //获取连接对象
        Connection conn = dataSource.getConnection();
        //使用数据源
        System.out.println(conn);
        //归还数据源资源
        conn.close();

    }



    /**
     * 测试手动创建c3p0数据源(jdbc.properties加载配置文件)
     */
    @Test
    public void test3() throws Exception {
        //读取配置文件
//        jdbc.properties  直接读取文件名jdbc即可
        ResourceBundle rb= ResourceBundle.getBundle("jdbc");
        String driver = rb.getString("jdbc.driver");
        String url = rb.getString("jdbc.url");
        String username = rb.getString("jdbc.username");
        String password = rb.getString("jdbc.password");

        //创建数据源对象、 设置连接参数
        ComboPooledDataSource  dataSource = new ComboPooledDataSource();
        dataSource.setDriverClass(driver);
        dataSource.setJdbcUrl(url);
        dataSource.setUser(username);
        dataSource.setPassword(password);

        //获取连接对象
        Connection conn = dataSource.getConnection();
        //使用连接数据源
        System.out.println(conn);
        //归还数据源
        conn.close();


    }





    /**
     * 测试手动创建druid数据源
     */
    @Test
    public void test2() throws SQLException {
        DruidDataSource dataSource = new DruidDataSource();
        //设置连接参数
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        //设置数据库地址
        dataSource.setUrl("jdbc:mysql://localhost:3306/lhw");
        //设置数据源，用户名和密码
        dataSource.setUsername("root");
        dataSource.setPassword("123456");

        //获取连接对象
        DruidPooledConnection conn = dataSource.getConnection();
        //打印连接对象信息(使用数据源)
        System.out.println(conn);
        //使用数据源完毕，归还数据源
        conn.close();

    }


    /**
     * 测试手动创建c3p0数据源
     */
    @Test
    public void test1() throws Exception {
        //创建数据源
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        //设置连接参数
        dataSource.setDriverClass("com.mysql.jdbc.Driver");
        //设置数据库地址
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/lhw");
        //设置数据源，用户名和密码
        dataSource.setUser("root");
        dataSource.setPassword("123456");

        //获取连接对象
        Connection conn = dataSource.getConnection();
        //打印连接对象信息(使用数据源)
        System.out.println(conn);
        //使用数据源完毕，归还数据源
        conn.close();

    }
}
