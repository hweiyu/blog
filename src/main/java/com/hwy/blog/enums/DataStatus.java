package com.hwy.blog.enums;

import java.util.Optional;

/**
 * @author huangweiyu
 * @version V1.0
 * @Title: 描述
 * @Description: 描述
 * @date 2018/6/14 11:58
 **/
public enum DataStatus {

    DISABLE(0, "禁用"),

    ENABLE(1, "启用"),

    DELETE(2, "删除");

    private int status;

    private String desc;

    DataStatus(int status, String desc) {
        this.status = status;
        this.desc = desc;
    }

    public static Optional<DataStatus> of(int status) {
        for (DataStatus cur : DataStatus.values()) {
            if (status == cur.getStatus()) {
                return Optional.of(cur);
            }
        }
        return Optional.empty();
    }

    public int getStatus() {
        return status;
    }

    public String getDesc() {
        return desc;
    }
}
