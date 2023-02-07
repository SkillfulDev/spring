package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContex.xml");
//        Music music = context.getBean("musicBean", Music.class);
//        MusicPlayer player = new MusicPlayer(music);
        Music Cm = new ClassicalMusic();
        Music R = new RapMusic();
        Music Rock = new RockMusic();


        MusicPlayer player = context.getBean("musicPlayer", MusicPlayer.class);
        player.setSongList(Cm);
        player.setSongList(R);
        player.setSongList(Rock);

        player.playMusicList();
        context.close();
    }
}
