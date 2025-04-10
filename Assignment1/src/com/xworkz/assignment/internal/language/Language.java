package com.xworkz.assignment.internal.language;

public class Language {
    private String name;
    private int speakers;
    private String type;

    public Language(String name, int speakers, String type) {
        this.name = name;
        this.speakers = speakers;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Language{name='" + name + "', speakers=" + speakers + ", type='" + type + "'}";
    }

    @Override
    public int hashCode() {
        System.out.println("LangHashCode:"+super.hashCode());
        return 8;
    }
}
