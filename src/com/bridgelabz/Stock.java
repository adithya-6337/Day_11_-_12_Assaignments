package com.bridgelabz;

public class Stock {
    String name;
    int noOfShares;
    double sharePrice;
    Stock(String name, int noOfShares, double sharePrice) {
        this.name = name;
        this.noOfShares = noOfShares;
        this.sharePrice = sharePrice;
    }
    public void printStockReport() {
        double stockValue = this.noOfShares * this.sharePrice;
        System.out.println(name + " stock value is Rs:" + stockValue);
    }
    public double getStockValue() {
        return this.noOfShares * this.sharePrice;
    }
}
