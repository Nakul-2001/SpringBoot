package com.sharma.nakul.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("prod")
public class MessageProdService implements MessageService {

    @Override
    public String getMessage() {
        return "Hello from the Production environment";
    }
}
