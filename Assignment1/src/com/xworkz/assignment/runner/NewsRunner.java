package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.news.News;

public class NewsRunner {
    public static void main(String[] args) {
        News news = new News("TV9", "Kannada", "Breaking");
        System.out.println(news);
        System.out.println(news.hashCode());
        System.out.println("Original HashCode:"+System.identityHashCode(news));
    }
}
