package com.lanou.mapper;

import com.lanou.bean.TbFriendlylink;

public interface TbFriendlylinkMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbFriendlylink record);

    int insertSelective(TbFriendlylink record);

    TbFriendlylink selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TbFriendlylink record);

    int updateByPrimaryKey(TbFriendlylink record);
}