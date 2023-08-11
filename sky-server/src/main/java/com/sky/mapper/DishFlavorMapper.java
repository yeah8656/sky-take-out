package com.sky.mapper;

import com.sky.entity.DishFlavor;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author CQ F
 * @version 1.0
 * @date 2023/8/11
 */
@Mapper
public interface DishFlavorMapper {


    /**
     * 批量插入菜品口味
     * @param flavors
     */
    void insertBatch(List<DishFlavor> flavors);
}
