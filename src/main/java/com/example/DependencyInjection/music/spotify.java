package com.example.DependencyInjection.music;

import com.example.DependencyInjection.musicplay;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

@Primary
public class spotify implements musicplay {
    public void sing(){
        System.out.println("Music playing on spotify");
    }
}
