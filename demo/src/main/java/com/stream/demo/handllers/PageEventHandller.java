package com.stream.demo.handllers;

import com.stream.demo.events.PageEvent;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.function.Consumer;

@Component
public class PageEventHandller {

    @Bean
    public Consumer<PageEvent> pageEventConsumer() {
        return (input) -> {
            System.out.println("************");
            System.out.println(input.toString());
            System.out.println("************");
        };
    }



}