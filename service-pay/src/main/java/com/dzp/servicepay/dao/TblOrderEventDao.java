package com.dzp.servicepay.dao;

import com.dzp.servicepay.entity.TblOrderEvent;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TblOrderEventDao {
    int deleteByPrimaryKey(Integer id);

    int insert(TblOrderEvent record);

    int insertSelective(TblOrderEvent record);

    TblOrderEvent selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TblOrderEvent record);

    int updateByPrimaryKey(TblOrderEvent record);
}