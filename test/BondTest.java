import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BondTest {
    String integralString = "Integral";
    String ibmString = "IBM";

    int integralShares = 3000;
    int ibmShares = 250;

    Dollar integralPrice = new Dollar(3.75);
    Dollar ibmPrice = new Dollar(5);

    Bond integral = new Bond(integralString, integralShares, integralPrice);
    Bond ibm = new Bond(ibmString, ibmShares,ibmPrice);

    @Test
    public void total(){
        assertEquals(new Dollar(11250), integral.getTotal());
        assertEquals(new Dollar(1250), ibm.getTotal());
    }
}