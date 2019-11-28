package com.hnu.ccdm.service;

import com.hnu.ccdm.entity.Coupletsexisted;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CoupletsExistedService {

    int addCouplet(Coupletsexisted coupletsexisted);

    int deleteCoupletById(String coupletId);

    // 通过用户id查询用户
    Coupletsexisted getCoupletById(String coupletId);

    // 用户列表
    List<Coupletsexisted> getCoupletList();

}
