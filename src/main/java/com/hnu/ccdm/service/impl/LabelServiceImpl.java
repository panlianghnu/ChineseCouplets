package com.hnu.ccdm.service.impl;

import com.hnu.ccdm.entity.Lable;
import com.hnu.ccdm.entity.LableExample;
import com.hnu.ccdm.mapper.LableMapper;
import com.hnu.ccdm.service.LabelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LabelServiceImpl implements LabelService {

    @Autowired
    LableMapper lableMapper;

    @Override
    public List<Lable>  getLabelList(){
        return lableMapper.selectByExample(new LableExample());
    }
}
