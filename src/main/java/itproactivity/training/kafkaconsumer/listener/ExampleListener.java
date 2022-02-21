package itproactivity.training.kafkaconsumer.listener;

import itproactivity.training.kafkaconsumer.model.User;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ExampleListener {

    @KafkaListener(topics="springboot-kafka", groupId = "string-consumers")
    public void consumeStringMessage(String message) {
        System.out.println("Consumed message: [" + message + "]");
    }

    /*
    @KafkaListener(topics=TOPIC, groupId = "string-consumers")
    public void consumeStringMessageToUpper(String message) {
        System.out.println("Consumed message: [" + message.toUpperCase() + "]");
    }
    */

    @KafkaListener(topics="springboot-kafka-json2", groupId = "json-consumers", containerFactory = "userKafkaFactoryListener")
    public void consumeUser(User user) {
        System.out.println("Consumed JSON message: [" + user + "]");
    }

}
