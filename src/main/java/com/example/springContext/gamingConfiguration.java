package com.example.springContext;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class gamingConfiguration {
    @Bean
    public gamingConsole2 gamingConsole(){
        return new Mario2();
    }

    @Bean
    public GameRunner2 gameRunner(gamingConsole2 game) {
        return new GameRunner2(game);
    }

}
