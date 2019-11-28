package com.hnu.ccdm.service.impl;

import com.hnu.ccdm.entity.Coupletsexisted;
import com.hnu.ccdm.entity.CoupletsexistedExample;
import com.hnu.ccdm.mapper.CoupletsexistedMapper;
import com.hnu.ccdm.service.CoupletsExistedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoupletsExistedServiceImpl implements CoupletsExistedService {

    @Autowired
    private CoupletsexistedMapper coupletsexistedMapper;

    @Override
    public int addCouplet(Coupletsexisted coupletsexisted) {
        return coupletsexistedMapper.insert(coupletsexisted);
    }

    @Override
    public int deleteCoupletById(String coupletId) {
        return coupletsexistedMapper.deleteByPrimaryKey(coupletId);
    }

    @Override
    public Coupletsexisted getCoupletById(String coupletId) {
        return coupletsexistedMapper.selectByPrimaryKey(coupletId);
    }

    @Override
    public List<Coupletsexisted> getCoupletList() {
        return coupletsexistedMapper.selectByExample(new CoupletsexistedExample());
    }

}
