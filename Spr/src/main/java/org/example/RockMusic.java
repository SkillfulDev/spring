package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class RockMusic implements Music{
    private List<String> listSong = new ArrayList<>();

    @Override
    public void getSong() {
        Random random = new Random();
        int number = random.nextInt(3);
        listSong.add("first Rock Song");
        listSong.add("second Rock Song");
        listSong.add("third Rock Song");
        System.out.println(listSong.get(number));
    }
}
