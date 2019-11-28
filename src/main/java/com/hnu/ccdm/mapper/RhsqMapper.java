package com.hnu.ccdm.mapper;

import com.hnu.ccdm.entity.Rhsq;
import com.hnu.ccdm.entity.RhsqExample;
import com.hnu.ccdm.entity.RhsqWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RhsqMapper {
    int countByExample(RhsqExample example);

    int deleteByExample(RhsqExample example);

    int deleteByPrimaryKey(String rhsqSqid);

    int insert(RhsqWithBLOBs record);

    int insertSelective(RhsqWithBLOBs record);

    List<RhsqWithBLOBs> selectByExampleWithBLOBs(RhsqExample example);

    List<Rhsq> selectByExample(RhsqExample example);

    RhsqWithBLOBs selectByPrimaryKey(String rhsqSqid);

    int updateByExampleSelective(@Param("record") RhsqWithBLOBs record, @Param("example") RhsqExample example);

    int updateByExampleWithBLOBs(@Param("record") RhsqWithBLOBs record, @Param("example") RhsqExample example);

    int updateByExample(@Param("record") Rhsq record, @Param("example") RhsqExample example);

    int updateByPrimaryKeySelective(RhsqWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(RhsqWithBLOBs record);

    int updateByPrimaryKey(Rhsq record);
}