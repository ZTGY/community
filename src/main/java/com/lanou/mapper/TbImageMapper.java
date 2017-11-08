package com.lanou.mapper;

import com.lanou.bean.TbImage;

public interface TbImageMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbImage record);

    int insertSelective(TbImage record);

    TbImage selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TbImage record);

    int updateByPrimaryKey(TbImage record);
}