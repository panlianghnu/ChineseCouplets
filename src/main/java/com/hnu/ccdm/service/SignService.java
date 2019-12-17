package com.hnu.ccdm.service;

import com.hnu.ccdm.entity.Sign;

import java.util.List;

public interface SignService {

    List<Sign> getSignList();

    int addSign(Sign sign);
}
