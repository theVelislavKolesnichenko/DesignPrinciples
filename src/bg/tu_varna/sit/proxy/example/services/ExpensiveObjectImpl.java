package bg.tu_varna.sit.proxy.example.services;

public class ExpensiveObjectImpl implements ExpensiveObject {

    String result;
    public ExpensiveObjectImpl() {
        heavyInitialConfiguration();
    }

    public String getResult() {
        return result;
    }

    @Override
    public void process() {
        result += " processing complete.";
    }

    private void heavyInitialConfiguration() {
        result = "Loading initial configuration...";
    }
}
