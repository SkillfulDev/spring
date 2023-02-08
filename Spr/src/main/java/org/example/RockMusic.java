package org.example;

public class RockMusic implements Music{
    public void doInitMethod(){
        System.out.println("Hello there");
    }

    @Override
    public void getSong() {
        System.out.println("This is rock music");
    }
}
