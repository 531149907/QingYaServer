package p.hin.qingya.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import p.hin.qingya.entity.Message;
import p.hin.qingya.service.MessageService;

import java.util.List;

@RestController
@EnableAutoConfiguration
@RequestMapping("/api/message")
public class MessageController {
    @Autowired
    MessageService service;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    Message getMessage(@PathVariable("id") int id) {
        return service.getMessageById(id);
    }

    @RequestMapping(method = RequestMethod.GET)
    List<Message> getMessages() {
        return service.getMessages();
    }
}
