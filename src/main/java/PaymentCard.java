import java.util.ArrayList;
import java.util.Calendar;

public abstract class PaymentCard implements IChargeable {

    private int cardNumber;
    private String expiryDate;
    private int securityNumber;
    private int ArrayList<Double> charges;

    public PaymentCard(int cardNumber, String expiryDate, int securityNumber) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.securityNumber = securityNumber;
        this.charges = new ArrayList<Double>();
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

    public ArrayList<Double> getCharges(){
        return charges;
    }

    public double paymentFee() {
        return charges * 1.2;
    }
}
