import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DollarTest {

   double threeSeventyFiveAmount = 3.75;
   int fourAmount = 4;
   int threeAmount = 3;

   Dollar three = new Dollar(threeAmount);
   Dollar threeSeventyFive = new Dollar(threeSeventyFiveAmount);
   Dollar four = new Dollar(fourAmount);


   @Test
   public void add(){
      assertEquals(new Dollar(7.75), threeSeventyFive.plus(four));
      assertEquals(new Dollar(6.75), threeSeventyFive.plus(three));
   }

   @Test
   public void multiply(){
      assertEquals(new Dollar(12), three.times(4));
      assertEquals(new Dollar(9), three.times(3));
   }



}