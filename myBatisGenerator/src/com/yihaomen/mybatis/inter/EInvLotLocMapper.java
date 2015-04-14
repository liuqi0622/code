package com.yihaomen.mybatis.inter;

import com.yihaomen.mybatis.model.EInvLotLoc;

public interface EInvLotLocMapper {
    int deleteByPrimaryKey(Long id);

    int insert(EInvLotLoc record);

    int insertSelective(EInvLotLoc record);

    EInvLotLoc selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(EInvLotLoc record);

    int updateByPrimaryKey(EInvLotLoc record);
}