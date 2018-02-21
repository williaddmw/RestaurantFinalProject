package com.mapper;

import com.domain.CustReview;
import com.domain.CustReviewExample;
import java.util.List;

public interface CustReviewMapper {
    int deleteByPrimaryKey(Short reviewid);

    int insert(CustReview record);

    int insertSelective(CustReview record);

    List<CustReview> selectByExample(CustReviewExample example);

    CustReview selectByPrimaryKey(Short reviewid);

    int updateByPrimaryKeySelective(CustReview record);

    int updateByPrimaryKey(CustReview record);
}