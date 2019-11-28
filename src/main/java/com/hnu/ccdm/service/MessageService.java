package com.hnu.ccdm.service;

import com.hnu.ccdm.entity.Message;

import java.util.List;

public interface MessageService {
    List<Message> getMessageList ();
    void deleteMessageById(String id);
}
