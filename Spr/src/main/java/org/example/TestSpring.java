package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContex.xml");
        Music music = context.getBean("musicBean", Music.class);
        MusicPlayer player = new MusicPlayer(music);
        player.playMusic();
        context.close();
    }
}
