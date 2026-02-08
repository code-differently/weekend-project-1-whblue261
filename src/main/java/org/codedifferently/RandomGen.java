package org.codedifferently;
import java.util.Random;


public class RandomGen {
   public static Random myRandom = new Random();



      public static int generateVisitId() {
         return myRandom.nextInt(9000 + 1000);

      }


      public double itemPrices() {
         return myRandom.nextDouble(3.00,30.00 );

         }

         public double stateTax() {
            return myRandom.nextDouble(0.0, 0.011 );

         }

          public double discountTotal() {
             return myRandom.nextDouble(6.00, 15.00 );

         }

}





































