package org.codedifferently;
import java.util.Random;


public class RandomGen {
   public static Random myRandom = new Random();



      public int generateVisitId() {
         return myRandom.nextInt(9000 + 1000);

      }


      public double itemPrices() {
         return myRandom.nextDouble(3.00,30.00 );

         }

         public double stateTax() {
            return myRandom.nextDouble(0.005, 0.007 );

         }

          public double discountTotal() {
             return myRandom.nextDouble(1.00, 5.00 );

         }

}





































