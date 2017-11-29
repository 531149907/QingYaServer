package p.hin.qingya.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import p.hin.qingya.entity.Feedback;

import java.util.List;

@Mapper
public interface FeedbackMapper {

    @Select("select * from feedback")
    List<Feedback> getFeedBacks();

    @Insert("insert into feedback(userId,date,content) values(#{userId},#{date},#{content})")
    void insertFeedback(Feedback feedback);
}
