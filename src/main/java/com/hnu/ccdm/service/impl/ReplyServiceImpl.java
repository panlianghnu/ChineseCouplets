package com.hnu.ccdm.service.impl;

import com.hnu.ccdm.entity.Reply;
import com.hnu.ccdm.entity.ReplyExample;
import com.hnu.ccdm.mapper.ReplyMapper;
import com.hnu.ccdm.service.ReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReplyServiceImpl implements ReplyService {
    @Autowired
    private ReplyMapper replyMapper;

    @Override
    public int addReply(Reply reply) {
        return replyMapper.insert(reply);
    }

    @Override
    public Reply getReplyById(String id) {
        return replyMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Reply> getReplyList() {
        return replyMapper.selectByExampleWithBLOBs(new ReplyExample());
    }

    @Override
    public int deleteReplyById(String id) {
        return replyMapper.deleteByPrimaryKey(id);
    }
}
