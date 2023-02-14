package org.example;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music {
    private ClassicalMusic() {

    }

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    public void doInitMethod() {
        System.out.println("initialization");
    }

    public void doDestMethod() {
        System.out.println("destroing");
    }

    @Override
    public void getSong() {
        System.out.println("This is  Classical Music");
    }
}
