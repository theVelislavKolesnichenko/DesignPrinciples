package bg.tu_varna.sit.command.commands;

import bg.tu_varna.sit.command.contracts.Order;
import bg.tu_varna.sit.command.request.Stock;

public class SellStock implements Order {
    private Stock abcStock;

    public SellStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.sell();
    }
}
