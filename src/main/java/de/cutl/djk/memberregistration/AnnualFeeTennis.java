package de.cutl.djk.memberregistration;

public enum AnnualFeeTennis {

    CHILDREN( 98, "Kinder und Jugendliche bis 18 Jahre"),
    STUDENTS( 156, "Studenten, Schüler, Azubis über 18 Jahren"),
    REDUCED( 156, "Sonstige Ermäßigte*"),
    ADULT( 216, "Erwachsene ab 18 Jahren"),
    COUPLE_BOTH_TENNIS( 332, "Ehepaare (beide Tennis) "),
    COUPLE_ONE_TENNIS( 276, "Ehepaare (nur eine Person Tennis) "),
    CHILDREN_BOTH_PARENTS_TENNIS( 26, "Jugendliche bis 18 Jahre (beide Eltern im Verein)"),
    WORK_DUTY_SINGLE( 30, "Arbeitsdienst - je Person über 18 Jahre"),
    WORK_DUTY_COUPLE_BOTH_TENNIS( 30, "Arbeitsdienst - Ehepaare (beide Tennis)");

    public final long price;
    public final String displayValue;

    AnnualFeeTennis(long price, String displayValue) {
        this.price = price;
        this.displayValue = displayValue;
    }
}
