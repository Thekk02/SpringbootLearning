package com.kk.springadvance.basedo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author kk
 * @description 基础DO类
 * @date 2025-11-19 09:46:37
 */
@Data
public class BaseDo implements Serializable {
    private Long id;

    private Date createTime;
    private Date updateime;
}
