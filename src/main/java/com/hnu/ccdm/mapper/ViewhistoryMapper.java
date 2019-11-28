package com.hnu.ccdm.mapper;

import com.hnu.ccdm.entity.Viewhistory;
import com.hnu.ccdm.entity.ViewhistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ViewhistoryMapper {
    int countByExample(ViewhistoryExample example);

    int deleteByExample(ViewhistoryExample example);

    int deleteByPrimaryKey(String viewhistoryId);

    int insert(Viewhistory record);

    int insertSelective(Viewhistory record);

    List<Viewhistory> selectByExampleWithBLOBs(ViewhistoryExample example);

    List<Viewhistory> selectByExample(ViewhistoryExample example);

    Viewhistory selectByPrimaryKey(String viewhistoryId);

    int updateByExampleSelective(@Param("record") Viewhistory record, @Param("example") ViewhistoryExample example);

    int updateByExampleWithBLOBs(@Param("record") Viewhistory record, @Param("example") ViewhistoryExample example);

    int updateByExample(@Param("record") Viewhistory record, @Param("example") ViewhistoryExample example);

    int updateByPrimaryKeySelective(Viewhistory record);

    int updateByPrimaryKeyWithBLOBs(Viewhistory record);

    int updateByPrimaryKey(Viewhistory record);
}