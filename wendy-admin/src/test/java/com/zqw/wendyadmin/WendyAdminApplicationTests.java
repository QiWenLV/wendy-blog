package com.zqw.wendyadmin;

import com.zqw.wendyadmin.image.bean.entity.OssInfo;
import com.zqw.wendyadmin.image.dao.OssInfoMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class WendyAdminApplicationTests {

    @Autowired
    private OssInfoMapper ossInfoMapper;

    @Test
    void contextLoads() {

        ossInfoMapper.insert(OssInfo.builder().accesskeyId("asd").accesskeySecret("asda").endpoint("sad").build());
    }

}
