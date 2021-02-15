package com.example.security.controllers;

import com.example.security.domain.Message;
import com.example.security.repos.MessageRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MessageController {
    private final MessageRepo messageRepo;

    @Autowired
    public MessageController(MessageRepo messageRepo){
        this.messageRepo = messageRepo;
    }

    @GetMapping("/get_all_messages")
    public List<Message> getMessages(){
        return messageRepo.findAll();
    }

    @PostMapping("/add_message")
    public Message addMessage(Message message){
        return messageRepo.save(message);
    }
}
