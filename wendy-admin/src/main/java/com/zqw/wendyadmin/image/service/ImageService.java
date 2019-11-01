package com.zqw.wendyadmin.image.service;

import com.zqw.wendyadmin.image.bean.entity.OssInfo;
import com.zqw.wendyadmin.image.handler.UserOssInfoHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Classname ImageService
 * @Description 图片服务
 * @Date 2019/11/2 0:19
 * @Created by zqw
 * @Version 1.0
 */
@Service
public class ImageService {

    @Autowired
    private UserOssInfoHandler userOssInfoHandler;

    public void loadListOfImages() {
        OssInfo ossInfo = userOssInfoHandler.getOssInfoByUserId("1");
//        new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);

    }

}
