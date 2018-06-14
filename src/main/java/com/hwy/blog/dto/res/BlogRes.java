package com.hwy.blog.dto.res;

import com.hwy.blog.model.Blog;
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

    public static BlogRes get(Blog blog) {
        if (null == blog) {
            return null;
        }
        return BlogRes.builder()
                .topic(blog.getTopic())
                .context(blog.getContext())
                .build();
    }
}
