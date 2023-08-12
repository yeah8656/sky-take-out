package com.sky.mapper;

import com.sky.entity.DishFlavor;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

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

    /**
     * 根据dish_id删除数据
     * @param dishId
     */
    @Delete("delete from setmeal_dish where dish_id = #{dishId}")
    void deleteByDishId(Long dishId);
    /**
     * 根据id查询菜品和对应的口味数据
     * @param dishId
     * @return
     */
    @Select("select * from dish_flavor where dish_id = #{dishId}")
    List<DishFlavor> getByDishId(Long dishId);
}
