package com.hnu.ccdm.service.impl;

import com.hnu.ccdm.entity.Coupletintro;
import com.hnu.ccdm.entity.CoupletintroExample;
import com.hnu.ccdm.entity.CoupletintroWithBLOBs;
import com.hnu.ccdm.mapper.CoupletintroMapper;
import com.hnu.ccdm.service.CoupletIntroService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoupletintroImpl implements CoupletIntroService {
    @Autowired
    private CoupletintroMapper coupletintroMapper;

    @Override
    public int addCoupletIntro(CoupletintroWithBLOBs coupletintroWithBLOBs) {
        return coupletintroMapper.insert(coupletintroWithBLOBs);
    }

    @Override
    public int deleteCoupletintroById(String coupletintroId) {
        return coupletintroMapper.deleteByPrimaryKey(coupletintroId);
    }

    @Override
    public CoupletintroWithBLOBs getCoupletintroById(String coupletintroId){
        return coupletintroMapper.selectByPrimaryKey(coupletintroId);
    }

    @Override
    public List<CoupletintroWithBLOBs> getCoupletintroWithBLOBsList() {
        return coupletintroMapper.selectByExampleWithBLOBs(new CoupletintroExample());

    }
}
