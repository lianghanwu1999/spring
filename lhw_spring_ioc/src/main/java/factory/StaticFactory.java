package factory;

import com.lhw.dao.UserDao;
import com.lhw.dao.impl.UserDaoImpl;

/**
 * @Author LiangHanWu
 * @Date 2021-06-03 20:59
 * @Version 1.0
 */
public class StaticFactory {
    /**
     * 演示静态工厂方法
     * @return
     */
    public static UserDao getUserDao(){
        return new UserDaoImpl();
    }
}
