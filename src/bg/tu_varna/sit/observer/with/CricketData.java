package bg.tu_varna.sit.observer.with;

import java.util.ArrayList;
import java.util.List;

public class CricketData implements Subject {
    private int runs;
    private int wickets;
    private float overs;
    private List<Observer> observerList;

    public CricketData() {
        observerList = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observerList.add(o);
    }

    @Override
    public void unregisterObserver(Observer o) {
        observerList.remove(observerList.indexOf(o));
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observerList) {
            observer.update(runs, wickets, overs);
        }
    }

    private int getLatestRuns() {
        return 90;
    }

    private int getLatestWickets() {
        return 2;
    }

    private float getLatestOvers() {
        return (float)10.2;
    }

    public void dataChanged() {
        runs = getLatestRuns();
        wickets = getLatestWickets();
        overs = getLatestOvers();

        notifyObservers();
    }

    public void setRuns(int runs) {
        this.runs = runs;
        notifyObservers();
    }
}
