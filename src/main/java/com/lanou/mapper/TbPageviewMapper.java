package com.lanou.mapper;

import com.lanou.bean.TbPageview;

public interface TbPageviewMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbPageview record);

    int insertSelective(TbPageview record);

    TbPageview selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TbPageview record);

    int updateByPrimaryKey(TbPageview record);
}