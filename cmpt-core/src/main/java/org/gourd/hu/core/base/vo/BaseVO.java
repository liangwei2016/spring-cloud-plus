package org.gourd.hu.core.base.vo;

import lombok.Data;

/**
 * @Description 基础vo对象
 * @author gourd.hu
 * @Date 2020/1/9 15:41
 * @Version 1.0
 */
@Data
public class BaseVO {

    /**
     * 主键id
     */
    private Long id;
    /**
     * 承租人id
     */
    private Long tenantId;


}
