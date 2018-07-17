package dao;

import entity.User;
import org.apache.ibatis.annotations.Param;

public interface  UserDao {
    /*查找用户密码*/
    User  findByUsername(String username);
    void  register(@Param("username")  String username ,
                   @Param("password") String password);
}
