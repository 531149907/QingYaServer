package p.hin.qingya.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import p.hin.qingya.entity.UserLove;

import java.util.List;

@Mapper
public interface UserLoveMapper {

    @Select("select * from user_love where userId=#{0}")
    List<UserLove> getUserCollections(int userId);

    @Delete("delete from user_love where id=#{0}")
    void deleteCollectionItem(int id);

    @Insert("insert into user_love(userId,type,contentId) values(#{userId},#{type},#{contentId})")
    void addCollectionItem(UserLove userLove);
}
