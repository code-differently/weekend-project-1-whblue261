package org.codedifferently;

public class Receipt {

    public static String generateRecieptId(String name, int idNumber) {
        String cleanName = name.trim().toUpperCase();
        String prefix = cleanName.substring(0, Math.min(3, cleanName.length()));
        return prefix + idNumber;
    }

    public static boolean isCouponValid(String code) {
        String cleanedCoupon = code.trim();
        return cleanedCoupon.equalsIgnoreCase("SAVE10")
                || cleanedCoupon.equalsIgnoreCase("VIP");
    }

    public static double applyExtraCoupon(double discountAmt, String code) {
        if (isCouponValid(code)) {
            return discountAmt + 2.00;
        }
        return discountAmt;
    }

    public static void couponMessage(String code) {
        if (isCouponValid(code)) {
            System.out.println("Congratulations !!! You earned 2.00 off.");
        } else {
            System.out.println("Sorry this isnt a valid code.");
        }
    }


    public static void printReceipt(
            String name,
            String code,
            int idNumber,
            double discountAmt,
            double firstItem,
            double secondItem,
            double thirdItem,
            double subTotal,
            double taxTotal,
            double roundedTotal) {

        String customerId = generateRecieptId(name, idNumber);

        System.out.println("\n=================================");
        System.out.println("        Maxx's Boutique");
        System.out.println("===================================");
        System.out.println("Customer Name: " + name);
        System.out.println("Receipt Id: " + customerId);
        System.out.println("Coupon Entered: " + code);

        couponMessage(code);
        System.out.println();

        System.out.printf("Item 1: $%.2f%n", firstItem);
        System.out.printf("Item 2: $%.2f%n", secondItem);
        System.out.printf("Item 3: $%.2f%n", thirdItem);

        System.out.printf("%nSubtotal: $%.2f%n", subTotal);
        System.out.printf("Tax due: $%.2f%n", taxTotal);
        System.out.printf("You saved: $%.2f%n", discountAmt);
        System.out.printf("Total: $%.2f%n", roundedTotal);

        System.out.println("===========================\n");
    }
}








