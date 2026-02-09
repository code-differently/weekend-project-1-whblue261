package org.codedifferently;

public class Calculations {
    public static double finalTotalBill;

    RandomGen random = new RandomGen();

    public double calculateTax(double amount){

        return amount * random.stateTax();

    }

    public double subTotalBill(double bill) {

        return random.itemPrices() + random.itemPrices() + random.itemPrices();

    }

    public double finalTotalBill(double bill, double taxAmt, double discount ){

        return (bill + taxAmt) - discount;
    }

    public double roundedTotal(double finalTotalBill){

        return Math.round(finalTotalBill*100)/100;
    }

    }
