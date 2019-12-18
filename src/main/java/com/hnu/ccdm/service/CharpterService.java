package com.hnu.ccdm.service;

import com.hnu.ccdm.entity.Charpter;

import java.util.List;

public interface CharpterService {
    List<Charpter> getCharpterList();
    int addCharpter(Charpter charpter);
    int deleteCharpter(String  id);
}
