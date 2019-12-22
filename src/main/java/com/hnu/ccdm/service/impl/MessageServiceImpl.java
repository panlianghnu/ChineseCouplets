package com.hnu.ccdm.service.impl;

import com.hnu.ccdm.entity.Message;
import com.hnu.ccdm.entity.MessageExample;
import com.hnu.ccdm.mapper.MessageMapper;
import com.hnu.ccdm.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

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

    @Override
    public int addMessage(String receiverId, String title, String content) {
        Message message = new Message();
        message.setMessageReceiverid(receiverId);
        message.setMessageTitle(title);
        message.setMessageContain(content);
        message.setMessageTime(new Date());
        message.setAdminId("1");
        message.setMessageMessageid(receiverId+(new Date().getTime()));
        return messageMapper.insert(message);
    }

    @Override
    public List<Message> getMessageListByUserId(String id) {
        List<Message> messageList = messageMapper.selectByExampleWithBLOBs(new MessageExample());
        List<Message> toBack = new LinkedList<>();
        for(Message x : messageList){
            if(x.getMessageReceiverid().equals(id)){
                toBack.add(x);
            }
        }
        Collections.sort(toBack, new Comparator<Message>() {
            @Override
            public int compare(Message message, Message t1) {
                return -message.getMessageTime().compareTo(t1.getMessageTime());
            }
        });
        return toBack;
    }

}
