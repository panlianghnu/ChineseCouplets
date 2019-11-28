package com.hnu.ccdm.mapper;

import com.hnu.ccdm.entity.CoupletsexistedCoupletsauthor22Example;
import com.hnu.ccdm.entity.CoupletsexistedCoupletsauthor22Key;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CoupletsexistedCoupletsauthor22Mapper {
    int countByExample(CoupletsexistedCoupletsauthor22Example example);

    int deleteByExample(CoupletsexistedCoupletsauthor22Example example);

    int deleteByPrimaryKey(CoupletsexistedCoupletsauthor22Key key);

    int insert(CoupletsexistedCoupletsauthor22Key record);

    int insertSelective(CoupletsexistedCoupletsauthor22Key record);

    List<CoupletsexistedCoupletsauthor22Key> selectByExample(CoupletsexistedCoupletsauthor22Example example);

    int updateByExampleSelective(@Param("record") CoupletsexistedCoupletsauthor22Key record, @Param("example") CoupletsexistedCoupletsauthor22Example example);

    int updateByExample(@Param("record") CoupletsexistedCoupletsauthor22Key record, @Param("example") CoupletsexistedCoupletsauthor22Example example);
}