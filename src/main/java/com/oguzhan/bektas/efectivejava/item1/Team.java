package com.oguzhan.bektas.efectivejava.item1;

public class Team {

    private String footballPlayer;
    private int age;

    public Team(String footballPlayer, int age) {
        this.footballPlayer = footballPlayer;
        this.age = age;
    }

    public static Team newFootballPlayer(String name) {
        return new Team(name, 22);
    }
}
