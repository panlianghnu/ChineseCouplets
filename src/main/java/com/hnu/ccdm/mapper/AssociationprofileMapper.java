package com.hnu.ccdm.mapper;

import com.hnu.ccdm.entity.Associationprofile;
import com.hnu.ccdm.entity.AssociationprofileExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AssociationprofileMapper {
    int countByExample(AssociationprofileExample example);

    int deleteByExample(AssociationprofileExample example);

    int deleteByPrimaryKey(String associationprofileId);

    int insert(Associationprofile record);

    int insertSelective(Associationprofile record);

    List<Associationprofile> selectByExampleWithBLOBs(AssociationprofileExample example);

    List<Associationprofile> selectByExample(AssociationprofileExample example);

    Associationprofile selectByPrimaryKey(String associationprofileId);

    int updateByExampleSelective(@Param("record") Associationprofile record, @Param("example") AssociationprofileExample example);

    int updateByExampleWithBLOBs(@Param("record") Associationprofile record, @Param("example") AssociationprofileExample example);

    int updateByExample(@Param("record") Associationprofile record, @Param("example") AssociationprofileExample example);

    int updateByPrimaryKeySelective(Associationprofile record);

    int updateByPrimaryKeyWithBLOBs(Associationprofile record);

    int updateByPrimaryKey(Associationprofile record);
}