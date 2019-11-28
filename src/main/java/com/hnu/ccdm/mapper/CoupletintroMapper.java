package com.hnu.ccdm.mapper;

import com.hnu.ccdm.entity.Coupletintro;
import com.hnu.ccdm.entity.CoupletintroExample;
import com.hnu.ccdm.entity.CoupletintroWithBLOBs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CoupletintroMapper {
    int countByExample(CoupletintroExample example);

    int deleteByExample(CoupletintroExample example);

    int deleteByPrimaryKey(String coupletsexistedId);

    int insert(CoupletintroWithBLOBs record);

    int insertSelective(CoupletintroWithBLOBs record);

    List<CoupletintroWithBLOBs> selectByExampleWithBLOBs(CoupletintroExample example);

    List<Coupletintro> selectByExample(CoupletintroExample example);

    CoupletintroWithBLOBs selectByPrimaryKey(String coupletsexistedId);

    int updateByExampleSelective(@Param("record") CoupletintroWithBLOBs record, @Param("example") CoupletintroExample example);

    int updateByExampleWithBLOBs(@Param("record") CoupletintroWithBLOBs record, @Param("example") CoupletintroExample example);

    int updateByExample(@Param("record") Coupletintro record, @Param("example") CoupletintroExample example);

    int updateByPrimaryKeySelective(CoupletintroWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(CoupletintroWithBLOBs record);

    int updateByPrimaryKey(Coupletintro record);
}