package com.mapper;

import com.domain.RestaurantOrder;
import com.domain.RestaurantOrderExample;
import java.util.List;

public interface RestaurantOrderMapper {
    int deleteByPrimaryKey(Short ono);

    int insert(RestaurantOrder record);

    int insertSelective(RestaurantOrder record);

    List<RestaurantOrder> selectByExample(RestaurantOrderExample example);

    RestaurantOrder selectByPrimaryKey(Short ono);

    int updateByPrimaryKeySelective(RestaurantOrder record);

    int updateByPrimaryKey(RestaurantOrder record);
}