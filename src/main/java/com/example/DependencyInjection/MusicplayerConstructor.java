package com.example.DependencyInjection;

import org.springframework.stereotype.Component;

@Component
public class MusicplayerConstructor {
    private musicplay music;
    public MusicplayerConstructor(musicplay music){
        this.music=music;
    }
    public void play(){
        System.out.println("Constructor Injection");
        music.sing();
    }

}
