package com.hnu.ccdm.service.impl;

import com.hnu.ccdm.entity.Coupletsauthor;
import com.hnu.ccdm.entity.CoupletsauthorExample;
import com.hnu.ccdm.mapper.CoupletsauthorMapper;
import com.hnu.ccdm.service.CoupletsAuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CoupletsAuthorImpl implements CoupletsAuthorService {
    @Autowired
    private CoupletsauthorMapper coupletsauthorMapper;

    @Override
    public Coupletsauthor getAuthorById(String id) {
        return coupletsauthorMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Coupletsauthor> getAuthorList() {
        return coupletsauthorMapper.selectByExample(new CoupletsauthorExample());
    }
}
