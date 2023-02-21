package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


public class RockMusic implements Music {
    private List<String> listSong = new ArrayList<>();
    {
        listSong.add("first Rock song");
        listSong.add("second Rock song");
        listSong.add("third Rock song");
    }


    @Override
    public List<String> getSong() {

     return listSong;
    }
}
