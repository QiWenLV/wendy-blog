package com.zqw.wendyadmin.image.bean.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.zqw.wendyadmin.common.bean.BeanEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Classname OssInfo
 * @Description TODO
 * @Date 2019/10/31 21:47
 * @Created by zqw
 * @Version 1.0
 */
@ApiModel(value = "com.zqw.wendyadmin.image.bean.entity.OssInfo")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName(value = "oss_info")
public class OssInfo extends BeanEntity {
    @TableId(value = "oss_id", type = IdType.AUTO)
    @ApiModelProperty(value = "null")
    private Integer ossId;

    @TableField(value = "oss_name")
    @ApiModelProperty(value = "null")
    private String ossName;

    /**
     * 服务商地址
     */
    @TableField(value = "endpoint")
    @ApiModelProperty(value = "服务商地址")
    private String endpoint;

    /**
     * 公钥
     */
    @TableField(value = "accesskey_id")
    @ApiModelProperty(value = "公钥")
    private String accesskeyId;

    /**
     * 私钥
     */
    @TableField(value = "accesskey_secret")
    @ApiModelProperty(value = "私钥")
    private String accesskeySecret;

    /**
     * 空间名称
     */
    @TableField(value = "bucket_name")
    @ApiModelProperty(value = "空间名称")
    private String bucketName;

    /**
     * 存储路径
     */
    @TableField(value = "file_dir")
    @ApiModelProperty(value = "存储路径")
    private String fileDir;

    /**
     * 备注
     */
    @TableField(value = "remarks")
    @ApiModelProperty(value = "备注")
    private String remarks;

    @TableField(value = "create_by")
    @ApiModelProperty(value = "null")
    private Integer createBy;

    @TableField(value = "create_date")
    @ApiModelProperty(value = "null")
    private Date createDate;

    @TableField(value = "update_by")
    @ApiModelProperty(value = "null")
    private Integer updateBy;

    @TableField(value = "update_date")
    @ApiModelProperty(value = "null")
    private Date updateDate;

    @TableField(value = "detele_flag")
    @ApiModelProperty(value = "null")
    private Boolean deteleFlag;

}