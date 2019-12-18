package com.hnu.ccdm.service;

import com.hnu.ccdm.entity.*;

import java.util.List;

public interface LastHotSearchService {
    int addLastHotSearch(Lasthotsearch lastHotSearch);
    List<Lasthotsearch> getLastHotSearch();
}
