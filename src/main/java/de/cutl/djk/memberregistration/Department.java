package de.cutl.djk.memberregistration;

public enum Department {


    BASKETBALL("Basketball"),
    FLOORBALL("Floorball"),
    FUSSBALL("Fußball"),
    FUSSBALL_AH("Fußball (AH)"),
    FITNESS("Fitness für Kinder"),
    TENNIS("Tennis"),
    TISCHTENNIS("Tischtennis"),
    VOLLEYBALL("Volleyball"),
    YOGA("Yoga"),
    ZUMBA("Zumba");


    public final String displayValue;

    Department(String displayValue) {
        this.displayValue = displayValue;
    }

    public String getDisplayValue() {
        return displayValue;
    }
}
