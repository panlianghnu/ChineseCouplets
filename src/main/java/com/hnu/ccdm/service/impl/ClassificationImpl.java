package com.hnu.ccdm.service.impl;

import com.hnu.ccdm.entity.Classification;
import com.hnu.ccdm.entity.ClassificationExample;
import com.hnu.ccdm.mapper.ClassificationMapper;
import com.hnu.ccdm.service.ClassificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ClassificationImpl implements ClassificationService {
    @Autowired
    ClassificationMapper classificationMapper;

    @Override
    public List<Classification> getClassificationList() {
        return classificationMapper.selectByExample(new ClassificationExample());
    }

    @Override
    public int addClassification(Classification classification) {
        return classificationMapper.insert(classification);
    }

    @Override
    public int deleteClassification(String id) {
        return classificationMapper.deleteByPrimaryKey(id);
    }
}
