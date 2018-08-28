package name.nch.model.payment;

public class MailMethod implements PaymentMethod {

    private String address;

    @Override
    public void pay(Paycheck paycheck) {

    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
