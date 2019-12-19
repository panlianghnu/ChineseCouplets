package com.hnu.ccdm.service.impl;

import com.hnu.ccdm.entity.Hotsearch;
import com.hnu.ccdm.entity.HotsearchExample;
import com.hnu.ccdm.mapper.HotsearchMapper;
import com.hnu.ccdm.service.HotSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HotSearchImpl implements HotSearchService {

    @Autowired
    private HotsearchMapper hotsearchMapper;

    @Override
    public int addHotSearch(Hotsearch hotsearch) {
        return hotsearchMapper.insert(hotsearch);
    }

    @Override
    public int deleteHotSearch(String id) {
        return hotsearchMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<Hotsearch> getHotSearchList(){
        return hotsearchMapper.selectByExample(new HotsearchExample());
    }

    @Override
    public int updateByPrimarKey(Hotsearch hotsearch) {
        return hotsearchMapper.updateByPrimaryKeySelective(hotsearch);
    }
}
