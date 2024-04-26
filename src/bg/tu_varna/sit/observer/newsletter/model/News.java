package bg.tu_varna.sit.observer.newsletter.model;

import bg.tu_varna.sit.observer.newsletter.enums.NewsType;

import java.util.Objects;

public class News {
    private NewsType type;
    private String content;

    public News(NewsType type, String content) {
        this.type = type;
        this.content = content;
    }

    public NewsType getType() {
        return type;
    }

    public String getContent() {
        return content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        News news = (News) o;
        return type == news.type && Objects.equals(content, news.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, content);
    }
}
