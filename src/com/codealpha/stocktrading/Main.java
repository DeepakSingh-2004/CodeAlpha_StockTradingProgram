package com.codealpha.stocktrading;
import com.codealpha.stocktrading.Model.Stock;
import com.codealpha.stocktrading.Model.User;

public class Main {
    public static void main(String[] args) {

         User deepak = new User(1, "Deepak Singh", 10000.00);
        System.out.println("User ID: " + deepak.getUserId());
        System.out.println("Portfolio: " + deepak.getPortfolio());
        System.out.println("Name: " + deepak.getName());
        System.out.println("Initial Funds: ₹" + deepak.getFunds());

        deepak.addFunds(5000);

        System.out.println("After Adding Funds: ₹" + deepak.getFunds());

        deepak.deductFunds(2000);

        System.out.println("After Deducting Funds: ₹" + deepak.getFunds());
    
        


        Stock tcs = new Stock("TCS", "Tata Consultancy Services", 3500.0);
System.out.println(tcs);
tcs.updatePrice(3600.0);
System.out.println(tcs);
    }
}
