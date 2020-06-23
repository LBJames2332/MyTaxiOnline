package com.taxi.apipassenger;

import org.springframework.cloud.netflix.eureka.server.event.EurekaInstanceCanceledEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class TestEvent {
    @EventListener
    public void listen(EurekaInstanceCanceledEvent event){
        System.out.println(event.getServerId()+"down了");
    }
}
