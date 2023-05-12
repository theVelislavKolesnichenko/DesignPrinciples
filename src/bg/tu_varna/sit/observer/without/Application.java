package bg.tu_varna.sit.observer.without;

public class Application {
    public static void main(String args[]) {
        AverageScoreDisplay averageScoreDisplay = new AverageScoreDisplay();
        CurrentScoreDisplay currentScoreDisplay = new CurrentScoreDisplay();

        CricketData cricketData = new CricketData(currentScoreDisplay, averageScoreDisplay);

        cricketData.dataChanged();
    }
}
