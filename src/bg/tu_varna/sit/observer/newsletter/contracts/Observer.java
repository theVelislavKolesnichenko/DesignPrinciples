package bg.tu_varna.sit.observer.newsletter.contracts;

import bg.tu_varna.sit.observer.newsletter.model.News;

public interface Observer {
    void update(News news);
}
