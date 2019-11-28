package com.hnu.ccdm.service.impl;

import com.hnu.ccdm.entity.Message;
import com.hnu.ccdm.entity.MessageExample;
import com.hnu.ccdm.mapper.MessageMapper;
import com.hnu.ccdm.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;
@Service
public class MessageServiceImpl implements MessageService {
    @Autowired
    MessageMapper messageMapper;

    @Override
    public List<Message> getMessageList() {
        return messageMapper.selectByExampleWithBLOBs(new MessageExample());
    }

    @Override
    public void deleteMessageById(String id) {
        messageMapper.deleteByPrimaryKey(id);
    }
}
