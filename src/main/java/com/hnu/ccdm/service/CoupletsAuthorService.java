package com.hnu.ccdm.service;

import com.hnu.ccdm.entity.Coupletsauthor;

import java.util.List;

public interface CoupletsAuthorService {
    Coupletsauthor getAuthorById(String id);
    List<Coupletsauthor> getAuthorList();
}
