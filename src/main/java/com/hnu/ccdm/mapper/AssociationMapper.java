package com.hnu.ccdm.mapper;

import com.hnu.ccdm.entity.Association;
import com.hnu.ccdm.entity.AssociationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AssociationMapper {
    int countByExample(AssociationExample example);

    int deleteByExample(AssociationExample example);

    int deleteByPrimaryKey(String associationNo);

    int insert(Association record);

    int insertSelective(Association record);

    List<Association> selectByExampleWithBLOBs(AssociationExample example);

    List<Association> selectByExample(AssociationExample example);

    Association selectByPrimaryKey(String associationNo);

    int updateByExampleSelective(@Param("record") Association record, @Param("example") AssociationExample example);

    int updateByExampleWithBLOBs(@Param("record") Association record, @Param("example") AssociationExample example);

    int updateByExample(@Param("record") Association record, @Param("example") AssociationExample example);

    int updateByPrimaryKeySelective(Association record);

    int updateByPrimaryKeyWithBLOBs(Association record);

    int updateByPrimaryKey(Association record);
}