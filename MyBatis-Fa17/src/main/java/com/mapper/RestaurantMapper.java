package com.mapper;

import com.domain.Restaurant;
import com.domain.RestaurantExample;
import java.util.List;

public interface RestaurantMapper {
    int deleteByPrimaryKey(Short restid);

    int insert(Restaurant record);

    int insertSelective(Restaurant record);

    List<Restaurant> selectByExample(RestaurantExample example);

    Restaurant selectByPrimaryKey(Short restid);

    int updateByPrimaryKeySelective(Restaurant record);

    int updateByPrimaryKey(Restaurant record);
}