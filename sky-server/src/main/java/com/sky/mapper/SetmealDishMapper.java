package com.sky.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author CQ F
 * @version 1.0
 * @date 2023/8/11
 */
@Mapper
public interface SetmealDishMapper {
    /**
     * 根据菜品id查询对应的套餐id
     */
    List<Long> getSetmealIdsByDishIds(List<Long> dishIds);
}
