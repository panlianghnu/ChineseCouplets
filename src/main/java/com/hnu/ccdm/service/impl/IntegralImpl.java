package com.hnu.ccdm.service.impl;

import com.hnu.ccdm.entity.Integral;
import com.hnu.ccdm.entity.IntegralExample;
import com.hnu.ccdm.mapper.IntegralMapper;
import com.hnu.ccdm.service.IntegralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IntegralImpl implements IntegralService {

    @Autowired
    IntegralMapper integralMapper;

    @Override
    public List<Integral> getIntegralList(){
        return integralMapper.selectByExample(new IntegralExample()) ;
    }

    @Override
    public int addIntegral(Integral integral) {
        return integralMapper.insert(integral);
    }
}
