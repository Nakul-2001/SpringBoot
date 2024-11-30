package com.sharma.nakul.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("dev")
public class MessageDevService implements MessageService {

    @Override
    public String getMessage() {
        return "Hello from the Development environment";
    }
}
