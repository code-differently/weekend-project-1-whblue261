package org.codedifferently;

import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in  the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in);


        System.out.println(" Welcome to Maxx's Boutique");

        System.out.println("Enter your name: ");
        String name = input.next();

        System.out.println("Input budget: ");
        double budget = input.nextDouble();;
        input.nextLine();

        System.out.println("Enter coupon code: ");
        String code = input.next();

        int idNumber = RandomGen.generateVisitId();
        double stateTax = RandomGen.stateTax();
        double discountAmt = RandomGen.discountTotal();

        double firstItem = RandomGen.itemPrice();
        double secondItem = RandomGen.itemPrice();
        double thirdItem = RandomGen.itemPrice();

        double subTotal = Calculations.subTotalBill(firstItem,secondItem,thirdItem);
        double taxTotal = Calculations.calculateTax(subTotal,stateTax);
        double total = Calculations.totalBeforeDiscount(subTotal, taxTotal);
        discountAmt = Receipt.applyExtraCoupon(discountAmt,code);

        double  discountedTotal = Calculations.finalTotalBill(total,discountAmt);
        double roundedTotal = Calculations.roundedUp(discountedTotal);

        Receipt.printReceipt(
                name,
                code,
                idNumber,
                discountAmt,
                firstItem,
                secondItem,
                thirdItem,
                subTotal,
                taxTotal,
                roundedTotal
        );

        double remaining = budget - roundedTotal;
        if(remaining >= 0) {
            System.out.printf("You have $%.2f left in your budget.%n", remaining);
        }
        else {
            System.out.printf("You are $%.2f over your budget!%n");

        }
        input.close();























    }
    }

