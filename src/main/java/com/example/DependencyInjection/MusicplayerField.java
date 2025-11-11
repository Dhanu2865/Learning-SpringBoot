package com.example.DependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicplayerField {
    @Autowired
    private musicplay music;
    public void play(){
        System.out.println("Field Injection");
        music.sing();
    }
}
