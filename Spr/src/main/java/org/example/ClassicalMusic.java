package org.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


public class ClassicalMusic implements Music {
    private List<String> listSong = new ArrayList<>();

    {
        listSong.add("first Classical Song");
        listSong.add("second Classical Song");
        listSong.add("third Classical Song");
    }


    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }


    @Override
    public List<String> getSong() {
        return listSong;
    }
}

