package com.hnu.ccdm.mapper;

import com.hnu.ccdm.entity.Classification;
import com.hnu.ccdm.entity.ClassificationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClassificationMapper {
    int countByExample(ClassificationExample example);

    int deleteByExample(ClassificationExample example);

    int deleteByPrimaryKey(String classificationClassificationid);

    int insert(Classification record);

    int insertSelective(Classification record);

    List<Classification> selectByExample(ClassificationExample example);

    Classification selectByPrimaryKey(String classificationClassificationid);

    int updateByExampleSelective(@Param("record") Classification record, @Param("example") ClassificationExample example);

    int updateByExample(@Param("record") Classification record, @Param("example") ClassificationExample example);

    int updateByPrimaryKeySelective(Classification record);

    int updateByPrimaryKey(Classification record);
}