package com.codealpha.stocktrading.Model;


/**
 * Represents a single stock available in the market.
 * Holds basic market data: symbol, company name, and current price.
 */
public class Stock {
    
    private final String symbol;    // e.g. "TCS" - unique identifier, never changes
    private final String name;      // e.g. "Tata Consultancy Services"
    private Double currentPrice;    // changes over time via market simulation

    public Stock(String symbol, String name, Double curretPrice){
        this.symbol = symbol;
        this.name = name;
        this.currentPrice = currentPrice;
    }

    public String getSymbol(){
        return symbol;
    }

    public String getName(){
        return name;
    }

    public Double getCurrentPrice(){
        return currentPrice;
    }

     // Controlled update - only way to change the price.
     // Prevents invalid (negative or zero) prices from being set.

     public void updatePrice(Double newPrice){
        if(newPrice<=0){
            throw new IllegalArgumentException("Price must be positive. Got:"  +newPrice);

        }

     }
     @Override 
        public String toString(){
            return String.format("%-6s %-25s Rs.%.2f", symbol, name, currentPrice);
        }
}
