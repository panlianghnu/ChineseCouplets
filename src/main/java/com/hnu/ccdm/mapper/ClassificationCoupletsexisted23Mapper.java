package com.hnu.ccdm.mapper;

import com.hnu.ccdm.entity.ClassificationCoupletsexisted23Example;
import com.hnu.ccdm.entity.ClassificationCoupletsexisted23Key;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClassificationCoupletsexisted23Mapper {
    int countByExample(ClassificationCoupletsexisted23Example example);

    int deleteByExample(ClassificationCoupletsexisted23Example example);

    int deleteByPrimaryKey(ClassificationCoupletsexisted23Key key);

    int insert(ClassificationCoupletsexisted23Key record);

    int insertSelective(ClassificationCoupletsexisted23Key record);

    List<ClassificationCoupletsexisted23Key> selectByExample(ClassificationCoupletsexisted23Example example);

    int updateByExampleSelective(@Param("record") ClassificationCoupletsexisted23Key record, @Param("example") ClassificationCoupletsexisted23Example example);

    int updateByExample(@Param("record") ClassificationCoupletsexisted23Key record, @Param("example") ClassificationCoupletsexisted23Example example);
}