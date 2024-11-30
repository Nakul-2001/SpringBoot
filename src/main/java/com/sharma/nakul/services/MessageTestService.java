package com.sharma.nakul.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("test")
public class MessageTestService implements MessageService {

    @Override
    public String getMessage() {
        return "Hello from the Testing environment";
    }
}