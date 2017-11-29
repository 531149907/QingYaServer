package p.hin.qingya.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import p.hin.qingya.mapper.AppInfoMapper;

@Service
public class AppInfoService {
    @Autowired
    AppInfoMapper appInfoMapper;

    public String getAggreement(){
        return appInfoMapper.getAppInfo().getAgreement();
    }
}
