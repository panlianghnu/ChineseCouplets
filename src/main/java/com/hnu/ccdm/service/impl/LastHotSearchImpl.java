package com.hnu.ccdm.service.impl;

import com.hnu.ccdm.entity.Lasthotsearch;
import com.hnu.ccdm.entity.LasthotsearchExample;
import com.hnu.ccdm.mapper.LasthotsearchMapper;

import com.hnu.ccdm.service.LastHotSearchService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class LastHotSearchImpl implements LastHotSearchService {
    @Autowired
    private LasthotsearchMapper lasthotsearchMapper;

    @Override
    public int addLastHotSearch(Lasthotsearch lastHotSearch) {
        return lasthotsearchMapper.insert(lastHotSearch);
    }

    @Override
    public List<Lasthotsearch> getLastHotSearch(){
        return lasthotsearchMapper.selectByExample(new LasthotsearchExample());
    }
}
