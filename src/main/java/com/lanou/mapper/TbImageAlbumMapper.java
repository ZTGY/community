package com.lanou.mapper;

import com.lanou.bean.TbImageAlbum;

public interface TbImageAlbumMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbImageAlbum record);

    int insertSelective(TbImageAlbum record);

    TbImageAlbum selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TbImageAlbum record);

    int updateByPrimaryKeyWithBLOBs(TbImageAlbum record);

    int updateByPrimaryKey(TbImageAlbum record);
}