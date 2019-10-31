package com.zqw.wendyadmin.image.controller;

import com.zqw.wendyadmin.image.service.UploadService;
import com.zqw.wendyadmin.image.utils.ImgException;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@ApiOperation(value = "/upload", tags = "图片上传")
@RestController
@RequestMapping("upload")
public class UploadController {

    @Autowired
    private UploadService uploadService;

    @ApiOperation(value = "上传文件")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "form", name = "request", value = "request"),
            @ApiImplicitParam(paramType = "form", name = "file", value = "文件", required = true)
    })
    @RequestMapping(value = "/headImgUpload", method = RequestMethod.POST)
    public Map<String, Object> headImgUpload(HttpServletRequest request, MultipartFile file) throws IOException {

        MultipartFile mf = null;
        File mff = null;
        ArrayList<String> arrUrl = new ArrayList<>(); //返回url的集合

        if (!(request instanceof MultipartHttpServletRequest)) {
            String errorMsg = "your post form is not support ENCTYPE='multipart/form-data' ";
            System.out.println(errorMsg);
            throw new RuntimeException(errorMsg);
        }
        MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;


        Map<String, MultipartFile> fileMap = multipartRequest.getFileMap();

        for(Map.Entry<String, MultipartFile> entity : fileMap.entrySet()){
            // 获取单个文件
            mf = entity.getValue();
            String head = null;
            try {
                head = uploadService.updateHead(mf);
                arrUrl.add(head);
            } catch (ImgException e) {
                e.printStackTrace();
            }

        }

        Map<String, Object> value = new HashMap<String, Object>();
        value.put("success", true);
        value.put("errorCode", 0);
        value.put("errorMsg", "");
        try {
            //此处是调用上传服务接口，4是需要更新的userId 测试数据。
            value.put("urlData", arrUrl.get(0));
            value.put("urlMarkDown", "![](" + arrUrl.get(0) + ")");
        } catch (Exception e) {
            e.printStackTrace();
            value.put("success", false);
            value.put("errorCode", 200);
            value.put("errorMsg", "图片上传失败");
        }

        return value;
    }


    @RequestMapping(value = "/imageOrc", method = RequestMethod.POST)
    public String imageOrc(HttpServletRequest request, MultipartFile file) throws IOException {

        MultipartFile mf = null;
        File mff = null;
        ArrayList<String> arrUrl = new ArrayList<>(); //返回url的集合

        if (!(request instanceof MultipartHttpServletRequest)) {
            String errorMsg = "your post form is not support ENCTYPE='multipart/form-data' ";
            System.out.println(errorMsg);
            throw new RuntimeException(errorMsg);
        }
        MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;


        Map<String, MultipartFile> fileMap = multipartRequest.getFileMap();
        String imageContent = null;
        for(Map.Entry<String, MultipartFile> entity : fileMap.entrySet()){
            // 获取单个文件
            mf = entity.getValue();
            imageContent= uploadService.imageOrc(mf);
        }
//        Map<String, Object> value = new HashMap<String, Object>();
//        value.put("success", true);
//        value.put("errorCode", 0);
//        value.put("errorMsg", "");
//        try {
//            //此处是调用上传服务接口，4是需要更新的userId 测试数据。
//
//            value.put("data", imageContent);
////            value.put("urlMarkDown", "![](" + arrUrl.get(0) + ")");
//        } catch (Exception e) {
//            e.printStackTrace();
//            value.put("success", false);
//            value.put("errorCode", 200);
//            value.put("errorMsg", "图片上传失败");
//        }

        return imageContent;
    }

}
