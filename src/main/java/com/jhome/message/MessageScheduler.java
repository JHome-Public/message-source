package com.jhome.message;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.Message;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.function.Supplier;

@Slf4j
@Component
@RequiredArgsConstructor
public class MessageScheduler {

    private final MessageProducer producer;

    @Scheduled(fixedDelay = 5000)
    public void scheduleMessageProduction() {
        Supplier<Message<String>> messageSupplier = producer.produceMessage();
        log.info("Sent message: Hello, SCDF!, {}", messageSupplier.get());
    }

}
