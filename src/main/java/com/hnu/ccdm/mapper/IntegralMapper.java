package com.hnu.ccdm.mapper;

import com.hnu.ccdm.entity.Integral;
import com.hnu.ccdm.entity.IntegralExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IntegralMapper {
    int countByExample(IntegralExample example);

    int deleteByExample(IntegralExample example);

    int deleteByPrimaryKey(String integralId);

    int insert(Integral record);

    int insertSelective(Integral record);

    List<Integral> selectByExample(IntegralExample example);

    Integral selectByPrimaryKey(String integralId);

    int updateByExampleSelective(@Param("record") Integral record, @Param("example") IntegralExample example);

    int updateByExample(@Param("record") Integral record, @Param("example") IntegralExample example);

    int updateByPrimaryKeySelective(Integral record);

    int updateByPrimaryKey(Integral record);
}