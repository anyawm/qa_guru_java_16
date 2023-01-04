package stud.anna.data;

import java.io.Serializable;

public class MasterCard extends Card implements iCard, Serializable {
    public MasterCard() {
        super(PaymentSystem.MASTERCARD);
    }

    protected boolean isCountryValidForTheseCard(Country country) {
        return true;
    }
}
