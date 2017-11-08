package com.lanou.mapper;

import com.lanou.bean.TbTags;

public interface TbTagsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbTags record);

    int insertSelective(TbTags record);

    TbTags selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TbTags record);

    int updateByPrimaryKey(TbTags record);
}