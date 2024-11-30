package com.sharma.nakul.controllers;

import com.sharma.nakul.services.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/nakul/sharma")
public class MessageController {

    @Autowired
    MessageService messageService;

    @GetMapping("/get/message")
    public String getMessage() {
        return messageService.getMessage();
    }
}
