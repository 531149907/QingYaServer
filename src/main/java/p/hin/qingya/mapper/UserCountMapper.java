package p.hin.qingya.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import p.hin.qingya.entity.UserCount;

import java.util.List;

@Mapper
public interface UserCountMapper {

    @Select("select * from user_count ")
    List<UserCount> getUserCounts();

    @Select("select * from user_count where userId=#{0}")
    List<UserCount> getUserCounts(int userId);
}
