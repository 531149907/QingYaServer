package p.hin.qingya.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import p.hin.qingya.entity.Banner;
import p.hin.qingya.service.BannerService;

import java.util.List;

@RestController
@EnableAutoConfiguration
@RequestMapping("/api/banner")
public class BannerController {
    @Autowired
    BannerService service;

    @RequestMapping(method = RequestMethod.GET)
    List<Banner> getBanners(){
        return service.getBanners();
    }
}
