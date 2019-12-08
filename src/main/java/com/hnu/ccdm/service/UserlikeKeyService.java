package com.hnu.ccdm.service;

import com.hnu.ccdm.entity.UserlikeKey;

import java.util.List;

public interface UserlikeKeyService {
    List<UserlikeKey> getUserLikeList();

    int addUserLike(String userId, String postId);

    int deleteUserLike(String userId, String postId);
}
