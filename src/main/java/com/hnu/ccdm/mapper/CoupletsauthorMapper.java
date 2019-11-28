package com.hnu.ccdm.mapper;

import com.hnu.ccdm.entity.Coupletsauthor;
import com.hnu.ccdm.entity.CoupletsauthorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CoupletsauthorMapper {
    int countByExample(CoupletsauthorExample example);

    int deleteByExample(CoupletsauthorExample example);

    int deleteByPrimaryKey(String coupletsauthorId);

    int insert(Coupletsauthor record);

    int insertSelective(Coupletsauthor record);

    List<Coupletsauthor> selectByExample(CoupletsauthorExample example);

    Coupletsauthor selectByPrimaryKey(String coupletsauthorId);

    int updateByExampleSelective(@Param("record") Coupletsauthor record, @Param("example") CoupletsauthorExample example);

    int updateByExample(@Param("record") Coupletsauthor record, @Param("example") CoupletsauthorExample example);

    int updateByPrimaryKeySelective(Coupletsauthor record);

    int updateByPrimaryKey(Coupletsauthor record);
}