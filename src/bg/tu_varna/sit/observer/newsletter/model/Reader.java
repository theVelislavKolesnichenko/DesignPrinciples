package bg.tu_varna.sit.observer.newsletter.model;

import bg.tu_varna.sit.observer.newsletter.contracts.Observer;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Reader implements Observer {
    private final Set<News> news;
    private String name;

    public Reader(String name) {
        this.name = name;
        this.news = new HashSet<>();
    }

    @Override
    public void update(News news) {
        System.out.println(this.name + " read " + news.getContent());
        this.news.add(news);
    }
}
