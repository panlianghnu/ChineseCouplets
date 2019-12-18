package com.hnu.ccdm.mapper;

import com.hnu.ccdm.entity.Charpter;
import com.hnu.ccdm.entity.CharpterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CharpterMapper {
    int countByExample(CharpterExample example);

    int deleteByExample(CharpterExample example);

    int deleteByPrimaryKey(String charpterid);

    int insert(Charpter record);

    int insertSelective(Charpter record);

    List<Charpter> selectByExampleWithBLOBs(CharpterExample example);

    List<Charpter> selectByExample(CharpterExample example);

    Charpter selectByPrimaryKey(String charpterid);

    int updateByExampleSelective(@Param("record") Charpter record, @Param("example") CharpterExample example);

    int updateByExampleWithBLOBs(@Param("record") Charpter record, @Param("example") CharpterExample example);

    int updateByExample(@Param("record") Charpter record, @Param("example") CharpterExample example);

    int updateByPrimaryKeySelective(Charpter record);

    int updateByPrimaryKeyWithBLOBs(Charpter record);

    int updateByPrimaryKey(Charpter record);
}