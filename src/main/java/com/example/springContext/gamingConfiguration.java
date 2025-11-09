package com.example.springContext;

import com.example.springContext.game2.Mario2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class gamingConfiguration {
    @Bean
    public com.example.springContext.gamingConsole2 gamingConsole(){
        return new Mario2();
    }

    @Bean
    public com.example.springContext.GameRunner2 gameRunner(com.example.springContext.gamingConsole2 game) {
        return new com.example.springContext.GameRunner2(game);
    }

}
