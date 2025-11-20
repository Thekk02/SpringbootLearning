package com.kk.springadvance.dto;

import com.kk.springadvance.base.BaseDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * @author kk
 * @description 用户的DTO
 * @date 2025-11-20 08:31:20
 */
@Data
@ApiModel("用户基础实体对象")
@Accessors(chain = true)
public class UserDTO extends BaseDTO {

    @ApiModelProperty(value = "用户id",required = true)
    private Long userId;

    @ApiModelProperty(value = "用户名",required = true)
    private Long userName;

    @ApiModelProperty(value = "用户id",example = "ADMIN|NORMAL")
    private String role;

    /**
     * 公司
     */
    @ApiModelProperty(value = "公司")
    private String company;

    /**
     * 扩展字段
     */
    @ApiModelProperty(hidden = true)
    private String extend;

    /**
     * 是否删除
     */
    @ApiModelProperty(hidden = true, value = "用户是否被删除")
    private Integer deleted;

    /**
     * 用户的邮箱
     */
    @ApiModelProperty(value = "用户邮箱", example = "paicoding@126.com")
    private String email;
}
