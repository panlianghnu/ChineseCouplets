package com.hnu.ccdm.mapper;

import com.hnu.ccdm.entity.Coupletsbyuser;
import com.hnu.ccdm.entity.CoupletsbyuserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CoupletsbyuserMapper {
    int countByExample(CoupletsbyuserExample example);

    int deleteByExample(CoupletsbyuserExample example);

    int deleteByPrimaryKey(String coupletsbyuserId);

    int insert(Coupletsbyuser record);

    int insertSelective(Coupletsbyuser record);

    List<Coupletsbyuser> selectByExample(CoupletsbyuserExample example);

    Coupletsbyuser selectByPrimaryKey(String coupletsbyuserId);

    int updateByExampleSelective(@Param("record") Coupletsbyuser record, @Param("example") CoupletsbyuserExample example);

    int updateByExample(@Param("record") Coupletsbyuser record, @Param("example") CoupletsbyuserExample example);

    int updateByPrimaryKeySelective(Coupletsbyuser record);

    int updateByPrimaryKey(Coupletsbyuser record);
}