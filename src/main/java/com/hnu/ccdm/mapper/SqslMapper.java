package com.hnu.ccdm.mapper;

import com.hnu.ccdm.entity.Sqsl;
import com.hnu.ccdm.entity.SqslExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SqslMapper {
    int countByExample(SqslExample example);

    int deleteByExample(SqslExample example);

    int deleteByPrimaryKey(String sqslSqbh);

    int insert(Sqsl record);

    int insertSelective(Sqsl record);

    List<Sqsl> selectByExample(SqslExample example);

    Sqsl selectByPrimaryKey(String sqslSqbh);

    int updateByExampleSelective(@Param("record") Sqsl record, @Param("example") SqslExample example);

    int updateByExample(@Param("record") Sqsl record, @Param("example") SqslExample example);

    int updateByPrimaryKeySelective(Sqsl record);

    int updateByPrimaryKey(Sqsl record);
}