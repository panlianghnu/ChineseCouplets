package com.hnu.ccdm.service;

import com.hnu.ccdm.entity.Follow;

import java.util.List;

public interface FollowService {
    List<Follow> getFollowList();
    int addFollow(String id, String followId);
    int deleteFollow(String id, String followId);
}
