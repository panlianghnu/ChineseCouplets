package com.hnu.ccdm.mapper;

import com.hnu.ccdm.entity.Searchhistory;
import com.hnu.ccdm.entity.SearchhistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SearchhistoryMapper {
    int countByExample(SearchhistoryExample example);

    int deleteByExample(SearchhistoryExample example);

    int deleteByPrimaryKey(String viewhistoryId);

    int insert(Searchhistory record);

    int insertSelective(Searchhistory record);

    List<Searchhistory> selectByExampleWithBLOBs(SearchhistoryExample example);

    List<Searchhistory> selectByExample(SearchhistoryExample example);

    Searchhistory selectByPrimaryKey(String viewhistoryId);

    int updateByExampleSelective(@Param("record") Searchhistory record, @Param("example") SearchhistoryExample example);

    int updateByExampleWithBLOBs(@Param("record") Searchhistory record, @Param("example") SearchhistoryExample example);

    int updateByExample(@Param("record") Searchhistory record, @Param("example") SearchhistoryExample example);

    int updateByPrimaryKeySelective(Searchhistory record);

    int updateByPrimaryKeyWithBLOBs(Searchhistory record);

    int updateByPrimaryKey(Searchhistory record);
}