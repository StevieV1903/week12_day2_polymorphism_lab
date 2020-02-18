import java.lang.ref.SoftReference;

public class CreditCard extends PaymentCard {

    public CreditCard(int cardNumber, String expiryDate, int securityNumber, int charge){
      super(cardNumber, expiryDate, securityNumber, charge);
    }

    @Override
    public void getTransactionCost(double transactionAmount) {
        this.charge += 1.2 * transactionAmount;
    }



}
