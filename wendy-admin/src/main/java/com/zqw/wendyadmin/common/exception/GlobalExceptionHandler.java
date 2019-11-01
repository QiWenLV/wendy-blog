package com.zqw.wendyadmin.common.exception;

import com.zqw.wendyadmin.common.bean.ResultData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Classname GlobalExceptionHandler
 * @Description 全局异常处理类
 * @Date 2019/11/1 23:42
 * @Created by zqw
 * @Version 1.0
 */
@ControllerAdvice
@ResponseBody
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    public ResultData defaultErrorHandler(Exception e){
        log.error("未知错误", e);
        return ResultData.error("未知错误");
    }

    @ExceptionHandler(value = ImgException.class)
    public ResultData imgExceptionHandler(ImgException e){
        log.error("图片错误", e);
        return ResultData.error("img-01", e.getMessage());
    }

    public ResultData dbDataExceptionHandler(DbDataException e){
        log.error("数据表数据异常", e);
        return ResultData.error("db-01", e.getMessage());
    }
}
