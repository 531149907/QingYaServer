package p.hin.qingya.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import p.hin.qingya.entity.Banner;
import p.hin.qingya.mapper.BannerMapper;

import java.util.List;

@Service
public class BannerService {
    @Autowired
    BannerMapper bannerMapper;

    List<Banner> getBanners(){
        return bannerMapper.getBanners();
    }
}
