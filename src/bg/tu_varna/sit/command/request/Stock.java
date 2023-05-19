package bg.tu_varna.sit.command.request;

public class Stock {
    private String name;
    private int quantity;

    public Stock(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String buy(){
        return "Stock [ Name: "+name+", Quantity: " + quantity +" ] bought";
    }
    public String sell(){
        return "Stock [ Name: "+name+", Quantity: " + quantity +" ] sold";
    }
}
