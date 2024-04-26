package bg.tu_varna.sit.observer.newsletter.model;

import bg.tu_varna.sit.observer.newsletter.contracts.Observer;
import bg.tu_varna.sit.observer.newsletter.contracts.Subject;
import bg.tu_varna.sit.observer.newsletter.enums.NewsType;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Newspaper implements Subject {

    private Map<NewsType, Set<News>> news;
    private Map<NewsType, Set<Observer>> observers;

    public Newspaper() {
        this.news = new HashMap<>();
        this.observers = new HashMap<>();
    }

    public void addNews(News value) {
        if (this.news.containsKey(value.getType())) {
            this.news.get(value.getType()).add(value);
        } else {
            this.news.put(value.getType(), new HashSet<>(){{
                add(value);
            }});
        }
        notifyObservers(value);
    }


    @Override
    public void registerObserver(NewsType type, Observer o) {
        if(this.observers.containsKey(type)) {
            this.observers.get(type).add(o);
        } else {
            this.observers.put(type, new HashSet<>() {{
                add(o);
            }});
        }
    }

    @Override
    public void unregisterObserver(NewsType type, Observer o) {
        if(this.observers.containsKey(type)) {
            this.observers.get(type).remove(o);
        }
    }

    @Override
    public void notifyObservers(News value) {
        for (Observer o : this.observers.get(value.getType())) {
            o.update(value);
        }
    }
}
