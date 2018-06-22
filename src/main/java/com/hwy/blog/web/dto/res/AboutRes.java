package com.hwy.blog.web.dto.res;

import com.hwy.blog.core.model.About;
import com.hwy.blog.web.dto.BaseRes;
import lombok.*;

/**
 * @author huangweiyu
 * @version V1.0
 * @Title: 描述
 * @Description: 描述
 * @date 2018/6/14 15:59
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class AboutRes extends BaseRes {

    private static final long serialVersionUID = 121169022741163629L;

    /**
     * 手机
     */
    private String phone;

    /**
     * QQ
     */
    private String qq;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 介绍内容
     */
    private String context;

    private String createTime;

    private String updateTime;

    public static AboutRes get(About about) {
        if (null == about) {
            return null;
        }
        return AboutRes.builder()
                .phone(about.getPhone())
                .qq(about.getQq())
                .email(about.getEmail())
                .context(about.getContext())
                .createTime(about.getCreateTime())
                .updateTime(about.getUpdateTime())
                .build();
    }
}
