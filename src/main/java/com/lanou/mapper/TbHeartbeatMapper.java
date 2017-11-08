package com.lanou.mapper;

import com.lanou.bean.TbHeartbeat;

public interface TbHeartbeatMapper {
    int insert(TbHeartbeat record);

    int insertSelective(TbHeartbeat record);
}