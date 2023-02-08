package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContex.xml");
//        Music music = context.getBean("musicBean", Music.class);
//        MusicPlayer player = new MusicPlayer(music);

        ClassicalMusic classicalMusic = context.getBean("classicalMusic", ClassicalMusic.class);
        ClassicalMusic classicalMusic1 = context.getBean("classicalMusic", ClassicalMusic.class);
        ClassicalMusic classicalMusic2 = context.getBean("classicalMusic", ClassicalMusic.class);
        classicalMusic.getSong();

        ClassicalMusic classicalMusic3 =ClassicalMusic.getClassicalMusic();


//        MusicPlayer player = context.getBean("musicPlayer", MusicPlayer.class);

        context.close();
    }
}
