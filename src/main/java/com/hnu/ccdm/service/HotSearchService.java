package com.hnu.ccdm.service;

import com.hnu.ccdm.entity.Hotsearch;

import java.util.List;

public interface HotSearchService {
    int addHotSearch(Hotsearch hotsearch);
    int deleteHotSearch(String id);
    List<Hotsearch> getHotSearchList();
}
