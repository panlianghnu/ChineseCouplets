package com.hnu.ccdm.service.impl;

import com.hnu.ccdm.entity.Collection1;
import com.hnu.ccdm.entity.Collection1Example;
import com.hnu.ccdm.mapper.Collection1Mapper;
import com.hnu.ccdm.service.Collection1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Collection1Impl implements Collection1Service {

    @Autowired
    private Collection1Mapper collection1Mapper;

    @Override
    public int addCollection(Collection1 collection1) {
        return collection1Mapper.insert(collection1);
    }

    @Override
    public int deleteCollectionById(String collectionId) {
        return collection1Mapper.deleteByPrimaryKey(collectionId);
    }

    @Override
    public List<Collection1> getCollectionList(){
        return collection1Mapper.selectByExample(new Collection1Example());
    }
}
