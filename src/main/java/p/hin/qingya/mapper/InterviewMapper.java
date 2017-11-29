package p.hin.qingya.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import p.hin.qingya.entity.Interview;

import java.util.List;

@Mapper
public interface InterviewMapper {

    @Select("select * from interview")
    List<Interview> getInterviews();

    @Select("select * from interview where id=#{0}")
    Interview getInterview(int id);

    @Select("select * from interview where title like #{0}")
    List<Interview> getInterviews(String keyword);
}
