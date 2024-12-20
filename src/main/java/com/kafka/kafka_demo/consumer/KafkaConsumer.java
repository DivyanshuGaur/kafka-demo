package com.kafka.kafka_demo.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

        @KafkaListener(topics = {"fruits"},groupId = "abc")
        public String consumeMessage(String message){
            System.out.println(message);
            return "Message sent to Broker...WOHO!!!!";
        }

}
