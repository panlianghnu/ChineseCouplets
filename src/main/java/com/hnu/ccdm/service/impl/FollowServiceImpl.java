package com.hnu.ccdm.service.impl;

import com.hnu.ccdm.entity.Follow;
import com.hnu.ccdm.entity.FollowExample;
import com.hnu.ccdm.mapper.FollowMapper;
import com.hnu.ccdm.service.FollowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class FollowServiceImpl implements FollowService {
    @Autowired
    FollowMapper followMapper;
    @Override
    public List<Follow> getFollowList() {
        return followMapper.selectByExample(new FollowExample());
    }

    @Override
    public int addFollow(String id, String followId) {
        Follow follow = new Follow();
        follow.setUserAccount(id);
        follow.setFollowFollowedaccount(followId);
        follow.setFollowFollowtime(new Date());
        return followMapper.insert(follow);
    }

    @Override
    public int deleteFollow(String id, String followId) {
        FollowExample followExample = new FollowExample();
        FollowExample.Criteria criteria = followExample.createCriteria();
        criteria.andUserAccountEqualTo(id);
        criteria.andFollowFollowedaccountEqualTo(followId);
        return followMapper.deleteByExample(followExample);
    }
}
