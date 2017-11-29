package p.hin.qingya.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import p.hin.qingya.entity.AppInfo;

@Mapper
public interface AppInfoMapper {

    @Select("selct * from appinfo")
    AppInfo getAppInfo();
}
