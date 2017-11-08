package com.lanou.mapper;

import com.lanou.bean.TbImageTags;

public interface TbImageTagsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbImageTags record);

    int insertSelective(TbImageTags record);

    TbImageTags selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TbImageTags record);

    int updateByPrimaryKey(TbImageTags record);
}