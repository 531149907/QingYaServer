package p.hin.qingya.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import p.hin.qingya.entity.Message;

import java.util.List;

@Mapper
public interface MessageMapper {
    @Select("select * from message")
    List<Message> getMessages();

    @Select("select * from message where id=#{0}")
    Message getMessage(int id);

}
