package com.zhang.zhangrabbitmqconsumer.receiver;


import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import java.util.Map;

@Component
@RabbitListener(queues = "TestDirectQueue")
public class DirectReceiver {
    @Bean
    public MessageConverter messageConverter(){
        return new Jackson2JsonMessageConverter();
    }
    @RabbitHandler(isDefault = true)
    public void process(Map map) {
            System.out.println("DirectReceiver消费者收到消息  : " + map);

    }

}