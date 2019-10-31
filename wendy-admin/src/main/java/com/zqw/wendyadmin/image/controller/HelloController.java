package com.zqw.wendyadmin.image.controller;

import com.baomidou.mybatisplus.extension.api.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname HelloController
 * @Description TODO
 * @Date 2019/10/31 22:25
 * @Created by zqw
 * @Version 1.0
 */
@Api(value = "/hello", tags = "图片上传")
@RestController
@RequestMapping("hello")
public class HelloController {

    @GetMapping("/list")
    @ApiOperation(value = "列表", notes = "分页列表")
    public String list(String id, @RequestParam @ApiParam("组件分类名称") String name) {
        return name + "1";
    }

}
