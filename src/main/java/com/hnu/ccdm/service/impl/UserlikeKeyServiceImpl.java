package com.hnu.ccdm.service.impl;

import com.hnu.ccdm.entity.UserlikeExample;
import com.hnu.ccdm.entity.UserlikeKey;
import com.hnu.ccdm.mapper.UserlikeMapper;
import com.hnu.ccdm.service.UserlikeKeyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserlikeKeyServiceImpl implements UserlikeKeyService {
    @Autowired
    private UserlikeMapper userlikeMapper;

    @Override
    public List<UserlikeKey> getUserLikeList() {
        return userlikeMapper.selectByExample(new UserlikeExample());
    }

    @Override
    public int addUserLike(String userId, String postId) {
        UserlikeKey userlikeKey = new UserlikeKey();
        userlikeKey.setPostid(postId);
        userlikeKey.setUseraccount(userId);
        return userlikeMapper.insert(userlikeKey);
    }

    @Override
    public int deleteUserLike(String userId, String postId) {
        UserlikeKey userlikeKey = new UserlikeKey();
        userlikeKey.setUseraccount(userId);
        userlikeKey.setPostid(postId);
        return userlikeMapper.deleteByPrimaryKey(userlikeKey);
    }
}
