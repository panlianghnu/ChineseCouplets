package com.hnu.ccdm.mapper;

import com.hnu.ccdm.entity.ReportAudit;
import com.hnu.ccdm.entity.ReportAuditExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReportAuditMapper {
    int countByExample(ReportAuditExample example);

    int deleteByExample(ReportAuditExample example);

    int deleteByPrimaryKey(String reportAuditReportno);

    int insert(ReportAudit record);

    int insertSelective(ReportAudit record);

    List<ReportAudit> selectByExampleWithBLOBs(ReportAuditExample example);

    List<ReportAudit> selectByExample(ReportAuditExample example);

    ReportAudit selectByPrimaryKey(String reportAuditReportno);

    int updateByExampleSelective(@Param("record") ReportAudit record, @Param("example") ReportAuditExample example);

    int updateByExampleWithBLOBs(@Param("record") ReportAudit record, @Param("example") ReportAuditExample example);

    int updateByExample(@Param("record") ReportAudit record, @Param("example") ReportAuditExample example);

    int updateByPrimaryKeySelective(ReportAudit record);

    int updateByPrimaryKeyWithBLOBs(ReportAudit record);

    int updateByPrimaryKey(ReportAudit record);
}