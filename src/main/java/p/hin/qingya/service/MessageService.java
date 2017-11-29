package p.hin.qingya.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import p.hin.qingya.entity.Message;
import p.hin.qingya.mapper.MessageMapper;

import java.util.List;

@Service
public class MessageService {
    @Autowired
    MessageMapper messageMapper;

    public List<Message> getMessages() {
        return messageMapper.getMessages();
    }

    public Message getMessageById(int id) {
        return messageMapper.getMessage(id);
    }
}
