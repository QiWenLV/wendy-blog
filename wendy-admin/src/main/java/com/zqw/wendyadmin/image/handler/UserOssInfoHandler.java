package com.zqw.wendyadmin.image.handler;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zqw.wendyadmin.common.exception.DbDataException;
import com.zqw.wendyadmin.image.bean.entity.OssInfo;
import com.zqw.wendyadmin.image.dao.OssInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import springfox.documentation.annotations.Cacheable;

import java.util.List;

/**
 * @Classname UserOssInfoHandler
 * @Description TODO
 * @Date 2019/11/2 0:48
 * @Created by zqw
 * @Version 1.0
 */
@Component
public class UserOssInfoHandler {

    @Autowired
    private OssInfoMapper ossInfoMapper;

    @Cacheable("ossInfo")
    public OssInfo getOssInfoByUserId(String userId){
        List<OssInfo> ossInfos = ossInfoMapper.selectList(new QueryWrapper<OssInfo>()
                .eq("user_id", userId)
                .eq("first_flag", true)
        );
        if(ossInfos.isEmpty()){
            throw new DbDataException("数据表数据异常：" + OssInfoMapper.class.getName() + " 方法：getOssInfoByUserId");
        }
        return ossInfos.get(0);
    }

}
