package p.hin.qingya.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import p.hin.qingya.entity.User;

@Mapper
public interface UserMapper {

    @Select("select * from user where id=#{0}")
    User getUser(int id);

    @Select("select * from user where username=#{0}")
    User verifyUserByUsername(String username);

    @Select("select * from user where email=#{0}")
    User verifyUserByEmail(String email);

    @Select("select * from user where email=#{0} and password=#{1}")
    User getUser(String email, String password);

    @Insert("insert into user(email,username,password,signature) values(#{email},#{username},#{password},#{signature})")
    void addUser(User user);

    @Update("update user set password=#{1} where id=#{0}")
    void updateUserPassword(int userId, String password);

    @Update("update user set signature=#{1} where id=#{0}")
    void updateUserSignature(int userId, String signature);

    @Update("update user set username=#{1} where id=#{0}")
    void updateUserUsername(int userId, String username);
}
