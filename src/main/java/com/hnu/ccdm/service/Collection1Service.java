package com.hnu.ccdm.service;

import com.hnu.ccdm.entity.Classification;
import com.hnu.ccdm.entity.Collection1;

import java.util.List;

public interface Collection1Service {
    int addCollection(Collection1 collection1);

    int deleteCollectionById(String collectionId);//通过帖子编号删除帖子

    List<Collection1> getCollectionList();

}
