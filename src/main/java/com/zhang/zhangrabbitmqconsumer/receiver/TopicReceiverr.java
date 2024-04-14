package com.zhang.zhangrabbitmqconsumer.receiver;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "topicWoman")
public class TopicReceiverr {
    @RabbitHandler
    public void topicWoman(String s) {
        System.out.println(s);
    }
}
