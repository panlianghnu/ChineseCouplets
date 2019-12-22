package com.hnu.ccdm.service;

import com.hnu.ccdm.entity.Message;

import java.util.List;

public interface MessageService {
    List<Message> getMessageList ();
    void deleteMessageById(String id);
    int addMessage(String receiverId, String title, String content);
    List<Message> getMessageListByUserId(String id);
}
