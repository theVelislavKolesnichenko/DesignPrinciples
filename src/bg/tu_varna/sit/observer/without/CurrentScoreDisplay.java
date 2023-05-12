package bg.tu_varna.sit.observer.without;

public class CurrentScoreDisplay {
    private int runs;

    private int wickets;
    private float overs;

    public void update(int runs,int wickets,float overs)
    {
        this.runs = runs;
        this.wickets = wickets;
        this.overs = overs;
        display();
    }

    public void display()
    {
        System.out.println("\nCurrent Score Display: \n" +
                "Runs: " + runs +"\nWickets:"
                + wickets + "\nOvers: " + overs );
    }
}
