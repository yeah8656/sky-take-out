package com.sky.service;

import com.sky.dto.DishDTO;

/**
 * @author CQ F
 * @version 1.0
 * @date 2023/8/11
 */
public interface DishService {
    /**
     * 新增菜品和口味
     * @param dishDTO
     */
    public void saveWithFlavor(DishDTO dishDTO);
}
