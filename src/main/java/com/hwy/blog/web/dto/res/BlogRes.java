package com.hwy.blog.web.dto.res;

import com.hwy.blog.core.model.Blog;
import com.hwy.blog.web.dto.BaseRes;
import lombok.*;

/**
 * @author huangweiyu
 * @version V1.0
 * @Title: 描述
 * @Description: 描述
 * @date 2018/6/14 14:19
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class BlogRes extends BaseRes {

    private static final long serialVersionUID = 3360964817212260793L;

    /**
     * 标题
     */
    private String topic;

    /**
     * 内容
     */
    private String context;

    private String createTime;

    private String updateTime;

    public static BlogRes get(Blog blog) {
        if (null == blog) {
            return null;
        }
        return BlogRes.builder()
                .topic(blog.getTopic())
                .context(blog.getContext())
                .createTime(blog.getCreateTime())
                .updateTime(blog.getUpdateTime())
                .build();
    }
}
