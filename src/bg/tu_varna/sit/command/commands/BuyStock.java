package bg.tu_varna.sit.command.commands;

import bg.tu_varna.sit.command.contracts.Order;
import bg.tu_varna.sit.command.request.Stock;

public class BuyStock implements Order {
    private Stock abcStock;

    public BuyStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.buy();
    }
}
