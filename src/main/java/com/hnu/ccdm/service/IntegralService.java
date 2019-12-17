package com.hnu.ccdm.service;

import com.hnu.ccdm.entity.Integral;

import java.util.List;

public interface IntegralService {
    public List<Integral> getIntegralList();
    public int addIntegral(Integral integral);
}
