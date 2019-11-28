package com.hnu.ccdm.service;

import com.hnu.ccdm.entity.Coupletintro;
import com.hnu.ccdm.entity.CoupletintroWithBLOBs;

import java.util.List;

public interface CoupletIntroService {
    int addCoupletIntro(CoupletintroWithBLOBs coupletintroWithBLOBs);

    int deleteCoupletintroById(String coupletintroId);


    Coupletintro getCoupletintroById(String coupletintroId);

    List<Coupletintro> getCoupletintroList();
}
