package com.hnu.ccdm.service.impl;

import com.hnu.ccdm.entity.ClassificationCoupletsexisted23Example;
import com.hnu.ccdm.entity.ClassificationCoupletsexisted23Key;
import com.hnu.ccdm.mapper.ClassificationCoupletsexisted23Mapper;
import com.hnu.ccdm.service.ClassificationCoupletsexisted23KeyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ClassificationCoupletsexisted23KeyImpl implements ClassificationCoupletsexisted23KeyService {
    @Autowired
    private ClassificationCoupletsexisted23Mapper classificationCoupletsexisted23Mapper;

    @Override
    public List<ClassificationCoupletsexisted23Key> getClassificationWithCouplets() {
        return classificationCoupletsexisted23Mapper.selectByExample(new ClassificationCoupletsexisted23Example());
    }
}
