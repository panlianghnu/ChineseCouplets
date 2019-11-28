package com.hnu.ccdm.mapper;

import com.hnu.ccdm.entity.ClassificationCoupletsbyuser24Example;
import com.hnu.ccdm.entity.ClassificationCoupletsbyuser24Key;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClassificationCoupletsbyuser24Mapper {
    int countByExample(ClassificationCoupletsbyuser24Example example);

    int deleteByExample(ClassificationCoupletsbyuser24Example example);

    int deleteByPrimaryKey(ClassificationCoupletsbyuser24Key key);

    int insert(ClassificationCoupletsbyuser24Key record);

    int insertSelective(ClassificationCoupletsbyuser24Key record);

    List<ClassificationCoupletsbyuser24Key> selectByExample(ClassificationCoupletsbyuser24Example example);

    int updateByExampleSelective(@Param("record") ClassificationCoupletsbyuser24Key record, @Param("example") ClassificationCoupletsbyuser24Example example);

    int updateByExample(@Param("record") ClassificationCoupletsbyuser24Key record, @Param("example") ClassificationCoupletsbyuser24Example example);
}