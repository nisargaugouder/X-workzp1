package com.xworkz.assignment.internal.sports;

public class Sports {
    private String name;
    private int players;
    private String type;

    public Sports(String name, int players, String type) {
        this.name = name;
        this.players = players;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Sports{" +
                "name='" + name + '\'' +
                ", players=" + players +
                ", type='" + type + '\'' +
                '}';
    }
}
