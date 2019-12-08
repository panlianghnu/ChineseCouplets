package com.hnu.ccdm.service;

import com.hnu.ccdm.entity.Reply;

import java.util.List;

public interface ReplyService {
    int addReply(Reply reply);

    Reply getReplyById(String id);

    List<Reply> getReplyList();

    int deleteReplyById(String id);
}
