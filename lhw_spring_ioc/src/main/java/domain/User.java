package domain;

/**
 * @Author LiangHanWu
 * @Date 2021-06-04 3:55
 * @Version 1.0
 */
public class User {
    private String name;
    private String addr;

    //设置get 和set方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", addr='" + addr + '\'' +
                '}';
    }
}
