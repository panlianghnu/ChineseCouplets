package com.hnu.ccdm.service.impl;

import com.hnu.ccdm.entity.Charpter;
import com.hnu.ccdm.entity.CharpterExample;
import com.hnu.ccdm.mapper.CharpterMapper;
import com.hnu.ccdm.service.CharpterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CharpterImpl implements CharpterService {
    @Autowired
    private CharpterMapper charpterMapper;

    @Override
    public int deleteCharpter(String id) {
        return charpterMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int addCharpter(Charpter charpter) {
        return charpterMapper.insert(charpter);
    }

    @Override
    public List<Charpter> getCharpterList(){
        return charpterMapper.selectByExample(new CharpterExample());
    }
}
