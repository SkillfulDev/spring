package org.example;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private Music music;

    private String name;

    private int volume;

    private List<Music> songList = new ArrayList<>();

    public MusicPlayer() {
    }

    public MusicPlayer(Music music) {
        this.music = music;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    ;

    public void setSongList(List<Music> songList) {
        this.songList = songList;
    }

    public List<Music> getSongList() {
        return songList;
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public void playMusic() {
        music.getSong();
    }

    public void playMusicList() {
        for (Music music1 : songList) {
            music1.getSong();
        }

    }
}


