package de.cutl.djk.memberregistration;

public enum AnnualFee {

    ACTIVE_CHILDREN(72, "Kinder und Jugendliche bis 18 Jahre"),
    ACTIVE_STUDENTS( 84, "Studenten, Schüler, Azubis über 18 Jahren"),
    ACTIVE_REDUCED( 84, "Sonstige Ermäßigte"),
    ACTIVE_ADULT( 144, "Erwachsene ab 18 Jahren"),
    ACTIVE_FAMILY( 204, "Familienbeitrag (Jugendliche bis 18 Jahre)"),
    PASSIVE_ADULT( 62, "Erwachsene passive Mitglieder "),
    PASSIVE_FAMILY( 92, "Familienbeitrag passive Mitglieder");

    public final long price;
    public final String displayValue;

    AnnualFee(long price, String displayValue) {
        this.price = price;
        this.displayValue = displayValue;
    }
}
