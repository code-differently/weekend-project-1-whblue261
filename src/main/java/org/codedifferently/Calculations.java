package org.codedifferently;

public class Calculations {
    public static double finalTotalBill;



    public static double calculateTax(double subTotal, double stateTax ){

        return subTotal * stateTax;

    }
    public static double totalBeforeDiscount( double subTotal, double taxTotal){

        return subTotal + taxTotal;
    }

    public static double subTotalBill (double firstItem, double secondItem, double thirdItem ) {

        return firstItem + secondItem + thirdItem;
    }

    public static double finalTotalBill(double total, double discountAmt){

        return total - discountAmt;
    }

    public static double roundedUp(double discountedTotal){

        return Math.round(discountedTotal *100.0)/100.0;

    }

    }
