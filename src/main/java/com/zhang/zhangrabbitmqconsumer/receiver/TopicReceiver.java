package com.zhang.zhangrabbitmqconsumer.receiver;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.retry.backoff.Sleeper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
@Component
@RabbitListener(queues = "topicMan")
public class TopicReceiver {
    @RabbitHandler
    public void receiver(ArrayList arrayList) {
        System.out.println(arrayList);
    }
}
