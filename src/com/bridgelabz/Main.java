package com.bridgelabz;

public class Main {
    public static void main(String[] args) {
        Stock stock1 = new Stock("HDFC", 15, 200);
        Stock stock2 = new Stock("L&T", 20, 100);
        Stock stock3 = new Stock("Reliance", 5, 1000);

        stock1.printStockReport();
        stock2.printStockReport();
        stock3.printStockReport();

        StockPortfolio myPortfolio = new StockPortfolio();
        myPortfolio.add(stock1);
        myPortfolio.add(stock2);
        myPortfolio.add(stock3);

//        double total = myPortfolio.getTotalStockValue();
        System.out.println("Total Stocks Value = " + myPortfolio.getTotalStockValue());
    }
}
