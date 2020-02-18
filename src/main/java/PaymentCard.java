import java.util.Calendar;

public abstract class PaymentCard implements IChargeable {

    private int cardNumber;
    private String expiryDate;
    private int securityNumber;
    protected int charge;

    public PaymentCard(int cardNumber, String expiryDate, int securityNumber, int charge) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.securityNumber = securityNumber;
        this.charge = charge;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public int getSecurityNumber(){
        return securityNumber;
    }

    public int getChargeAmount(){
        return charge;
    }

    public double paymentFee() {
        return charge * 1.2;
    }
}
