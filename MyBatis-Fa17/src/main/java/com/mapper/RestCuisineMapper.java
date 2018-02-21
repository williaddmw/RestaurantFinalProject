package com.mapper;

import com.domain.RestCuisineExample;
import com.domain.RestCuisineKey;
import java.util.List;

public interface RestCuisineMapper {
    int deleteByPrimaryKey(RestCuisineKey key);

    int insert(RestCuisineKey record);

    int insertSelective(RestCuisineKey record);

    List<RestCuisineKey> selectByExample(RestCuisineExample example);
}