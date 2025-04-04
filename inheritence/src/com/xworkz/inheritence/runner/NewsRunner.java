package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.news.News;
import com.xworkz.inheritence.internal.news.BreakingNews;

public class NewsRunner {
    public static void main(String[] args) {
        News news = new News();
        news.report();
        news.broadcast();
        news.publish();
        news.politics();
        news.sports();

        System.out.println("-----------");

        News news2 = new BreakingNews();
        news2.report();
        news2.broadcast();
        news2.publish();
        news2.politics();
        news2.sports();

        System.out.println("-----------");

        BreakingNews breakingNews = new BreakingNews();
        breakingNews.report();
        breakingNews.broadcast();
        breakingNews.publish();
        breakingNews.politics();
        breakingNews.sports();
    }
}
