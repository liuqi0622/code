package com.liuqi.inter;

import com.liuqi.model.EInv;

public interface EInvMapper {
    int deleteByPrimaryKey(Long id);

    int insert(EInv record);

    int insertSelective(EInv record);

    EInv selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(EInv record);

    int updateByPrimaryKey(EInv record);
}