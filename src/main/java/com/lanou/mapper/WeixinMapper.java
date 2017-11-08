package com.lanou.mapper;

import com.lanou.bean.Weixin;

public interface WeixinMapper {
    int insert(Weixin record);

    int insertSelective(Weixin record);
}