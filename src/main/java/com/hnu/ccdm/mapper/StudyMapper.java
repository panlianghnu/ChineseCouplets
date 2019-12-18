package com.hnu.ccdm.mapper;

import com.hnu.ccdm.entity.Study;
import com.hnu.ccdm.entity.StudyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudyMapper {
    int countByExample(StudyExample example);

    int deleteByExample(StudyExample example);

    int deleteByPrimaryKey(String studyid);

    int insert(Study record);

    int insertSelective(Study record);

    List<Study> selectByExampleWithBLOBs(StudyExample example);

    List<Study> selectByExample(StudyExample example);

    Study selectByPrimaryKey(String studyid);

    int updateByExampleSelective(@Param("record") Study record, @Param("example") StudyExample example);

    int updateByExampleWithBLOBs(@Param("record") Study record, @Param("example") StudyExample example);

    int updateByExample(@Param("record") Study record, @Param("example") StudyExample example);

    int updateByPrimaryKeySelective(Study record);

    int updateByPrimaryKeyWithBLOBs(Study record);

    int updateByPrimaryKey(Study record);
}