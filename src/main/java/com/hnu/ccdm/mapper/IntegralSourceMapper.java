package com.hnu.ccdm.mapper;

import com.hnu.ccdm.entity.IntegralSource;
import com.hnu.ccdm.entity.IntegralSourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IntegralSourceMapper {
    int countByExample(IntegralSourceExample example);

    int deleteByExample(IntegralSourceExample example);

    int deleteByPrimaryKey(String integralSourceId);

    int insert(IntegralSource record);

    int insertSelective(IntegralSource record);

    List<IntegralSource> selectByExampleWithBLOBs(IntegralSourceExample example);

    List<IntegralSource> selectByExample(IntegralSourceExample example);

    IntegralSource selectByPrimaryKey(String integralSourceId);

    int updateByExampleSelective(@Param("record") IntegralSource record, @Param("example") IntegralSourceExample example);

    int updateByExampleWithBLOBs(@Param("record") IntegralSource record, @Param("example") IntegralSourceExample example);

    int updateByExample(@Param("record") IntegralSource record, @Param("example") IntegralSourceExample example);

    int updateByPrimaryKeySelective(IntegralSource record);

    int updateByPrimaryKeyWithBLOBs(IntegralSource record);

    int updateByPrimaryKey(IntegralSource record);
}