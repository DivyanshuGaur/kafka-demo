package com.kafka.kafka_demo.producer;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaProducer {

    @Autowired
    private KafkaTemplate kafkaTemplate;

    @GetMapping("/send")
    public void getMessage(@RequestParam String message){
            kafkaTemplate.send("fruits",message);
    }



}
