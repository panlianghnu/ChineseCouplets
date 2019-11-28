package com.hnu.ccdm.service.impl;

import com.hnu.ccdm.entity.CoupletsexistedCoupletsauthor22Example;
import com.hnu.ccdm.entity.CoupletsexistedCoupletsauthor22Key;
import com.hnu.ccdm.mapper.CoupletsexistedCoupletsauthor22Mapper;
import com.hnu.ccdm.service.CoupletsexistedCoupletsauthor22Seivice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoupletsexistedCoupletsauthor22SeiviceImpl implements CoupletsexistedCoupletsauthor22Seivice {

    @Autowired
    private CoupletsexistedCoupletsauthor22Mapper coupletsexistedCoupletsauthor22Mapper;

    @Override
    public List<CoupletsexistedCoupletsauthor22Key> getCoupletsAuthorList() {
        return coupletsexistedCoupletsauthor22Mapper.selectByExample(new CoupletsexistedCoupletsauthor22Example());
    }
}
