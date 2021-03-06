package com.repository.entity.common;

import java.util.Date;

/**
 * @Description: 数据实体基类,所有实体类都继承此类
 * @Author: lin.shi
 * @CreateTime: 2017-09-12 16:51
 */
public class BaseEntity implements java.io.Serializable {
    private static final long serialVersionUID = 6786042125926490613L;

    protected String id;

    protected Date createTime;

    protected Date updateTime;

    protected AvailableEnum available;




    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public AvailableEnum getAvailable() {
        return available;
    }

    public void setAvailable(AvailableEnum available) {
        this.available = available;
    }
}
