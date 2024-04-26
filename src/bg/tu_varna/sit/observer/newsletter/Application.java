package bg.tu_varna.sit.observer.newsletter;

import bg.tu_varna.sit.observer.newsletter.enums.NewsType;
import bg.tu_varna.sit.observer.newsletter.model.News;
import bg.tu_varna.sit.observer.newsletter.model.Newspaper;
import bg.tu_varna.sit.observer.newsletter.model.Reader;

public class Application {
    public static void main(String[] args) {

        Newspaper newspaper = new Newspaper();
        Reader reader1 = new Reader("reader1");
        Reader reader2 = new Reader("reader2");

        newspaper.registerObserver(NewsType.SPORT, reader1);
        newspaper.registerObserver(NewsType.POLITICS, reader2);

        newspaper.addNews(new News(NewsType.POLITICS, "News POLITICS content"));
        newspaper.addNews(new News(NewsType.SPORT, "News SPORT content"));


    }
}
