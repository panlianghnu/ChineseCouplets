package com.hnu.ccdm.mapper;

import com.hnu.ccdm.entity.AssociationAdmin8Example;
import com.hnu.ccdm.entity.AssociationAdmin8Key;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AssociationAdmin8Mapper {
    int countByExample(AssociationAdmin8Example example);

    int deleteByExample(AssociationAdmin8Example example);

    int deleteByPrimaryKey(AssociationAdmin8Key key);

    int insert(AssociationAdmin8Key record);

    int insertSelective(AssociationAdmin8Key record);

    List<AssociationAdmin8Key> selectByExample(AssociationAdmin8Example example);

    int updateByExampleSelective(@Param("record") AssociationAdmin8Key record, @Param("example") AssociationAdmin8Example example);

    int updateByExample(@Param("record") AssociationAdmin8Key record, @Param("example") AssociationAdmin8Example example);
}