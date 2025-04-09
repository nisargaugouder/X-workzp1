package com.xworkz.assignment.internal.news;

public class News {
    private String channel;
    private String language;
    private String type;

    public News(String channel, String language, String type) {
        this.channel = channel;
        this.language = language;
        this.type = type;
    }

    @Override
    public String toString() {
        return "News{channel='" + channel + "', language='" + language + "', type='" + type + "'}";
    }
}
