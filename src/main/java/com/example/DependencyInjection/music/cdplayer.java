package com.example.DependencyInjection.music;

import com.example.DependencyInjection.musicplay;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class cdplayer implements musicplay {

    public void sing(){
        System.out.println("Music playing on cd");
    }
}
