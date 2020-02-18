import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CreditCardTest {

    CreditCard creditCard;

    @Before
    public void before(){
        creditCard = new CreditCard(12345678, "12/12/20", 234, 10);

    }

    @Test
    public void canGetCardNumber(){
        assertEquals(12345678, creditCard.getCardNumber());
    }

    @Test
    public void canGetExpiryDate(){
        assertEquals("12/12/20", creditCard.getExpiryDate());
    }

    @Test
    public void canGetSecurityNumber(){
        assertEquals(234, creditCard.getSecurityNumber());
    }

    @Test
    public void canGetChargeAmount(){
        assertEquals(10, creditCard.getChargeAmount());
    }

    @Test
    public void canGetTransactionCost(){
        creditCard.paymentFee();
        assertEquals(12, creditCard.getChargeAmount());
    }

}
