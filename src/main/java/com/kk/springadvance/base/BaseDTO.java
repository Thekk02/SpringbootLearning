package com.kk.springadvance.base;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @author kk
 * @description 基础DTO类
 * @date 2025-11-20 08:32:18
 */
@Data
public class BaseDTO {

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "最后编辑时间")
    private Date updapteTime;
}
