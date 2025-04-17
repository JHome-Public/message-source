package com.jhome.message;

import org.springframework.context.annotation.Bean;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

import java.util.function.Supplier;

@Component
public class MessageProducer {

    @Bean
    public Supplier<Message<String>> produceMessage() {
        return () -> MessageBuilder.withPayload("Hello, SCDF!").build();
    }

}
