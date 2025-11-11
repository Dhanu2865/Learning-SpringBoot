package com.example.DependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicplayerSetter {
    private musicplay music;
    @Autowired
    public void setMusicplayer(musicplay music){
        this.music = music;
    }

    public void play(){
        System.out.println("Setter Injection");
        music.sing();
    }

}
