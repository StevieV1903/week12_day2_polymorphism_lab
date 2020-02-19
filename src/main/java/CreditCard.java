public class CreditCard extends PaymentCard {

    private double creditLimit;

    public CreditCard(int cardNumber, String expiryDate, int securityNumber, double creditLimit){
      super(cardNumber, expiryDate, securityNumber);

      this.creditLimit = creditLimit;
    }

    public double getCreditLimit() {
        return this.creditLimit;
    }

    public void charge(double purchaseAmount) {
        this.creditLimit -= purchaseAmount;
        super.charge(purchaseAmount);
    }

//    @Override
//    public void getTransactionCost(double transactionAmount) {
//        this.charge += 1.2 * transactionAmount;
//    }



}
