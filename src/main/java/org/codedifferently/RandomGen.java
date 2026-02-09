package org.codedifferently;
import java.util.Random;


public class RandomGen {
   public static Random myRandom = new Random();



      public static int generateVisitId() {
         return myRandom.nextInt(9000 + 1000);

      }


      public static double itemPrice() {
         return myRandom.nextDouble(3.00,30.00 );

         }

         public static double stateTax() {
            return myRandom.nextDouble(0.005, 0.007 );

         }

          public static double discountTotal() {
             return myRandom.nextDouble(1.00, 5.00 );

         }

}





































