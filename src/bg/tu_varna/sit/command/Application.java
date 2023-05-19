package bg.tu_varna.sit.command;

import bg.tu_varna.sit.command.commands.BuyStock;
import bg.tu_varna.sit.command.commands.SellStock;
import bg.tu_varna.sit.command.contracts.Order;
import bg.tu_varna.sit.command.invoker.Broker;
import bg.tu_varna.sit.command.request.Stock;

public class Application {
    public static void main(String[] args) {
        Stock abcStock = new Stock("ABC", 10);

        Order buyStockOrder = new BuyStock(abcStock);
        Order sellStockOrder = new SellStock(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
    }
}
