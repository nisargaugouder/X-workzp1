package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.news.News;
import com.xworkz.inheritence.internal.news.BreakingNews;

public class NewsRunner {
    public static void main(String[] args) {
        News news = new BreakingNews();
        news.report();
        news.broadcast();
        news.publish();
        news.coverPolitics();
        news.coverSports();

        System.out.println("-----------------");
        BreakingNews breakingNews = new BreakingNews();
        breakingNews.report();
        breakingNews.broadcast();
        breakingNews.publish();
        breakingNews.coverPolitics();
        breakingNews.coverSports();
    }
}
