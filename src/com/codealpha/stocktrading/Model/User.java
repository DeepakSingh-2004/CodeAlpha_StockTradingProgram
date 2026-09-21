package com.codealpha.stocktrading.Model;

public class User {
    private final int userId;  // unique identifier for each user
    private final String name;
    private double funds;  // available cash balance
    private final Portfolio portfolio;  // // composition: User "has-a" Portfolio



    public User(int userId, String name, double initialFunds) {
    this.userId = userId;
    this.name = name;
    this.funds = initialFunds;
    this.portfolio = new Portfolio();
}

    public int getUserId() {
    return userId;
    }
    
    public String getName(){
        return name;
    }

    public double getFunds(){
        return funds;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }


     // Called during BUY - deducts money after validating sufficient funds
     public void deductFunds(double amount){
        if(amount>funds){
            throw new IllegalStateException(String.format("Insufficient funds. Available: Rs.%.2f, Required: Rs.%.2f", funds, amount)
        );
        }
        this.funds -= amount;
     }

     // Called during SELL - adds sale proceeds back to available funds.
     public void addFunds(double amount){
        if(amount<0){
            throw new IllegalArgumentException("Amount to add cannot be negative.");
               }
               this.funds += amount;
     }

     @Override 
    public String toString(){
        return String.format("User ID: %d | Name: %s | Available Funds: Rs.%.2f", userId, name, funds);
}
}
