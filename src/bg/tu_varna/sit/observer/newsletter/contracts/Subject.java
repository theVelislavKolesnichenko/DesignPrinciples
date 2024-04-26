package bg.tu_varna.sit.observer.newsletter.contracts;

import bg.tu_varna.sit.observer.newsletter.enums.NewsType;
import bg.tu_varna.sit.observer.newsletter.model.News;

public interface Subject {
    void registerObserver(NewsType type, Observer o);
    void unregisterObserver(NewsType type, Observer o);
    void notifyObservers(News type);
}
