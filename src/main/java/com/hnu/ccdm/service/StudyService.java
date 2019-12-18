package com.hnu.ccdm.service;

import com.hnu.ccdm.entity.Study;

import java.util.List;

public interface StudyService {
    List<Study> getStudyList();

    int addStudy(Study study);

    int deleteStudy(String id);
}
