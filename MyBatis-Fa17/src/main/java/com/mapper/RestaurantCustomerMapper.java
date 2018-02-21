package com.mapper;

import com.domain.RestaurantCustomer;
import com.domain.RestaurantCustomerExample;
import java.util.List;

public interface RestaurantCustomerMapper {
    int deleteByPrimaryKey(String email);

    int insert(RestaurantCustomer record);

    int insertSelective(RestaurantCustomer record);

    List<RestaurantCustomer> selectByExample(RestaurantCustomerExample example);

    RestaurantCustomer selectByPrimaryKey(String email);

    int updateByPrimaryKeySelective(RestaurantCustomer record);

    int updateByPrimaryKey(RestaurantCustomer record);
}