package org.example;

import java.util.ArrayList;
import java.util.List;

public class RapMusic implements Music{

    private List<String> listSong = new ArrayList<>();

    {
        listSong.add("first Rap Song");
        listSong.add("second Rap Song");
        listSong.add("third Rap Song");
    }
    @Override
    public List<String> getSong() {
        return listSong;
    }
}
