package com.hnu.ccdm.service.impl;

import com.hnu.ccdm.entity.Study;
import com.hnu.ccdm.entity.StudyExample;
import com.hnu.ccdm.mapper.StudyMapper;
import com.hnu.ccdm.service.StudyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudyImpl implements StudyService {
    @Autowired
    private StudyMapper studyMapper;

    @Override
    public List<Study> getStudyList(){
        return studyMapper.selectByExampleWithBLOBs(new StudyExample());
    }

    @Override
    public int addStudy(Study study) {
        return studyMapper.insert(study);
    }

    @Override
    public int deleteStudy(String id) {
        return studyMapper.deleteByPrimaryKey(id);
    }
}
