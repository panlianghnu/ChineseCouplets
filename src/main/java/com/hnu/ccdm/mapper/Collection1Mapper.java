package com.hnu.ccdm.mapper;

import com.hnu.ccdm.entity.Collection1;
import com.hnu.ccdm.entity.Collection1Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Collection1Mapper {
    int countByExample(Collection1Example example);

    int deleteByExample(Collection1Example example);

    int deleteByPrimaryKey(String collectionId);

    int insert(Collection1 record);

    int insertSelective(Collection1 record);

    List<Collection1> selectByExample(Collection1Example example);

    Collection1 selectByPrimaryKey(String collectionId);

    int updateByExampleSelective(@Param("record") Collection1 record, @Param("example") Collection1Example example);

    int updateByExample(@Param("record") Collection1 record, @Param("example") Collection1Example example);

    int updateByPrimaryKeySelective(Collection1 record);

    int updateByPrimaryKey(Collection1 record);
}