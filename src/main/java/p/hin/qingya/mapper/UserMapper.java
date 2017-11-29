package p.hin.qingya.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
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
    User getUser(String email,String password);

    @Insert("insert into user(email,username,password,signature) values(#{email},#{username},#{password},#{signature})")
    void addUser(User user);
}
