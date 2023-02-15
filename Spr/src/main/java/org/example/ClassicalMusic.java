package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class ClassicalMusic implements Music {
    private List<String> listSong = new ArrayList<>();

    private ClassicalMusic() {

    }

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    @Override
    public void getSong() {
        Random random = new Random();
        int number = random.nextInt(3);
        listSong.add("first Classical Song");
        listSong.add("second Classical Song");
        listSong.add("third Classical Song");
        System.out.println(listSong.get(number));

    }
}

