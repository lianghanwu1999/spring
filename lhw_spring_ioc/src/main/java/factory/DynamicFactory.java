package factory;

import com.lhw.dao.UserDao;
import com.lhw.dao.impl.UserDaoImpl;

/**
 * @Author LiangHanWu
 * @Date 2021-06-03 21:30
 * @Version 1.0
 */
public class DynamicFactory {
    /**
     * 颜色实例工厂方法
     */
    public UserDao getUserDao(){
        return new UserDaoImpl();
    }
}
