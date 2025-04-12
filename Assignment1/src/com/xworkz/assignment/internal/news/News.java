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

    @Override
    public int hashCode() {
        System.out.println("NewsHashCode:"+super.hashCode());
        return 2;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj != null){
            System.out.println("obj is null");
            if(obj instanceof News){
                System.out.println("obj instance of class");
                News news1=this;
                News news2=(News) obj;
                if(news1.channel.equals(news2.channel) && news1.type.equals(news2.type) && news1.language.equals(news2.language)){
                    System.out.println("both are same:");
                    return true;
                }
            }
        }
        return false;
    }
}
