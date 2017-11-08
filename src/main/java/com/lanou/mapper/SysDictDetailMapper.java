package com.lanou.mapper;

import com.lanou.bean.SysDictDetail;

public interface SysDictDetailMapper {
    int deleteByPrimaryKey(Integer detailId);

    int insert(SysDictDetail record);

    int insertSelective(SysDictDetail record);

    SysDictDetail selectByPrimaryKey(Integer detailId);

    int updateByPrimaryKeySelective(SysDictDetail record);

    int updateByPrimaryKey(SysDictDetail record);
}