package p.hin.qingya.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import p.hin.qingya.service.AppInfoService;

@RestController
@EnableAutoConfiguration
@RequestMapping("/api/info/")
public class AppInfoController {
    @Autowired
    AppInfoService service;

    @RequestMapping(value = "agreement",method = RequestMethod.GET)
    String getAgreement(){
        return service.getAggreement();
    }
}
