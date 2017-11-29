package p.hin.qingya.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import p.hin.qingya.entity.Banner;

import java.util.List;

@Mapper
public interface BannerMapper {

    @Select("select * from banner")
    List<Banner> getBanners();
}