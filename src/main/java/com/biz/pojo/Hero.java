package com.biz.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * @author tianshengfei
 * @Date 2019/8/4 11:54
 * @description
 */
@Data
public class Hero {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private String username;
    private String profession;
    private String phone;
    private String email;
    private Date onlinetime;
}
