package com.hnu.ccdm.mapper;

import com.hnu.ccdm.entity.Coupletsexisted;
import com.hnu.ccdm.entity.CoupletsexistedExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CoupletsexistedMapper {
    int countByExample(CoupletsexistedExample example);

    int deleteByExample(CoupletsexistedExample example);

    int deleteByPrimaryKey(String coupletsexistedId);

    int insert(Coupletsexisted record);

    int insertSelective(Coupletsexisted record);

    List<Coupletsexisted> selectByExample(CoupletsexistedExample example);

    Coupletsexisted selectByPrimaryKey(String coupletsexistedId);

    int updateByExampleSelective(@Param("record") Coupletsexisted record, @Param("example") CoupletsexistedExample example);

    int updateByExample(@Param("record") Coupletsexisted record, @Param("example") CoupletsexistedExample example);

    int updateByPrimaryKeySelective(Coupletsexisted record);

    int updateByPrimaryKey(Coupletsexisted record);
}