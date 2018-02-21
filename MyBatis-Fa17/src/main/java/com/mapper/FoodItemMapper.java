package com.mapper;

import com.domain.FoodItem;
import com.domain.FoodItemExample;
import java.util.List;

public interface FoodItemMapper {
    int deleteByPrimaryKey(String foodname);

    int insert(FoodItem record);

    int insertSelective(FoodItem record);

    List<FoodItem> selectByExample(FoodItemExample example);

    FoodItem selectByPrimaryKey(String foodname);

    int updateByPrimaryKeySelective(FoodItem record);

    int updateByPrimaryKey(FoodItem record);
}