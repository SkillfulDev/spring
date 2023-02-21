package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MusicPlayer {
    private List<Music> listMusic = new ArrayList<>();

    @Value("${musicPlayer.name}")
    String name;
    @Value("${musicPlayer.volume}")
    int volume;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public MusicPlayer(List<Music> listMusic) {
        this.listMusic = listMusic;
    }

    public void playSong(){
        Random random = new Random();
        int randomNumber = random.nextInt(3);
        System.out.println(listMusic.get(randomNumber).getSong().get(randomNumber));

    }
}

