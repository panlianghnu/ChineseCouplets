package com.hnu.ccdm.mapper;

import com.hnu.ccdm.entity.Lable;
import com.hnu.ccdm.entity.LableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LableMapper {
    int countByExample(LableExample example);

    int deleteByExample(LableExample example);

    int deleteByPrimaryKey(String lableContent);

    int insert(Lable record);

    int insertSelective(Lable record);

    List<Lable> selectByExample(LableExample example);

    Lable selectByPrimaryKey(String lableContent);

    int updateByExampleSelective(@Param("record") Lable record, @Param("example") LableExample example);

    int updateByExample(@Param("record") Lable record, @Param("example") LableExample example);

    int updateByPrimaryKeySelective(Lable record);

    int updateByPrimaryKey(Lable record);
}