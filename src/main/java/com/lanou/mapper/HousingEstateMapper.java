package com.lanou.mapper;

import com.lanou.bean.HousingEstate;

public interface HousingEstateMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HousingEstate record);

    int insertSelective(HousingEstate record);

    HousingEstate selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HousingEstate record);

    int updateByPrimaryKey(HousingEstate record);
}