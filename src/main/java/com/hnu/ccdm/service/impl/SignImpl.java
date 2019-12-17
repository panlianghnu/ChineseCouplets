package com.hnu.ccdm.service.impl;

import com.hnu.ccdm.entity.Sign;
import com.hnu.ccdm.entity.SignExample;
import com.hnu.ccdm.mapper.SignMapper;
import com.hnu.ccdm.service.SignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SignImpl implements SignService{

    @Autowired
    private SignMapper signMapper;

    @Override
    public int addSign(Sign sign) {
        return signMapper.insert(sign);
    }

    @Override
    public List<Sign> getSignList(){
        return signMapper.selectByExample(new SignExample());
    }
}
