package bg.tu_varna.sit.observer.without;

public class CricketData {
    private int runs;
    private int wickets;
    private float overs;
    private CurrentScoreDisplay currentScoreDisplay;
    private AverageScoreDisplay averageScoreDisplay;

    public CricketData(CurrentScoreDisplay currentScoreDisplay, AverageScoreDisplay averageScoreDisplay) {
        this.currentScoreDisplay = currentScoreDisplay;
        this.averageScoreDisplay = averageScoreDisplay;
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

        currentScoreDisplay.update(runs,wickets,overs);
        averageScoreDisplay.update(runs,wickets,overs);
    }
}
