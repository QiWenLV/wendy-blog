package com.zqw.wendyadmin.common.bean;

import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @Classname BeanEntity
 * @Description TODO
 * @Date 2019/10/31 21:44
 * @Created by zqw
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BeanEntity {

    @TableField(value = "create_by")
    @ApiModelProperty(value="null")
    private Integer createBy;

    @TableField(value = "create_date")
    @ApiModelProperty(value="null")
    private Date createDate;

    @TableField(value = "update_by")
    @ApiModelProperty(value="null")
    private Integer updateBy;

    @TableField(value = "update_date")
    @ApiModelProperty(value="null")
    private Date updateDate;

    @TableField(value = "detele_flag")
    @ApiModelProperty(value="null")
    private Boolean deteleFlag;
}
