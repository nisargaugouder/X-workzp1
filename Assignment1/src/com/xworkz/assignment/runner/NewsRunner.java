package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.news.News;

public class NewsRunner {
    public static void main(String[] args) {
        News news = new News("TV9", "Kannada", "Breaking");
        System.out.println(news);
        System.out.println(news.hashCode());
        System.out.println("Original HashCode:" + System.identityHashCode(news));

        News news1 = new News("Republic", "English", "Live");
        News news2 = new News("TV9", "Kannada", "Breaking");

        boolean same = news1.equals(news2);
        System.out.println("same: " + same);
    }
}
