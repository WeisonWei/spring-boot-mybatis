package com.weison.sbm.domain;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;


@Setter
@Getter
public abstract class BaseEntity {
    /**
     * 自增主键
     */
    protected int id;

    /**
     * 记录创建时间
     */
    protected LocalDateTime createTime = LocalDateTime.now();

    /**
     * 记录修改时间
     */
    protected LocalDateTime updateTime = LocalDateTime.now();
}
