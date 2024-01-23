package de.cutl.djk.memberregistration;

public enum AnnualFee implements AnnualFeeInterface {

    ACTIVE_CHILDREN(72, "Kinder und Jugendliche bis 18 Jahre"),
    ACTIVE_STUDENTS( 84, "Studenten, Schüler, Azubis über 18 Jahren"),
    ACTIVE_REDUCED( 84, "Sonstige Ermäßigte"),
    ACTIVE_ADULT( 144, "Erwachsene ab 18 Jahren"),
    ACTIVE_FAMILY( 204, "Familienbeitrag (Jugendliche bis 18 Jahre)"),
    PASSIVE_ADULT( 62, "Erwachsene passive Mitglieder "),
    PASSIVE_FAMILY( 92, "Familienbeitrag passive Mitglieder");

    final long price;
    final String displayText;

    AnnualFee(long price, String displayText) {
        this.price = price;
        this.displayText = displayText;
    }

    @Override
    public long getPrice() {
        return price;
    }

    @Override
    public String getDisplayValue() {
        return displayText;
    }
}
