package com.mapper;

import com.domain.RestaurantOdetails;
import com.domain.RestaurantOdetailsExample;
import com.domain.RestaurantOdetailsKey;
import java.util.List;

public interface RestaurantOdetailsMapper {
    int deleteByPrimaryKey(RestaurantOdetailsKey key);

    int insert(RestaurantOdetails record);

    int insertSelective(RestaurantOdetails record);

    List<RestaurantOdetails> selectByExample(RestaurantOdetailsExample example);

    RestaurantOdetails selectByPrimaryKey(RestaurantOdetailsKey key);

    int updateByPrimaryKeySelective(RestaurantOdetails record);

    int updateByPrimaryKey(RestaurantOdetails record);
}