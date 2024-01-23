package de.cutl.djk.memberregistration;

public enum Gender {
    MALE("Männlich"),
    FEMALE("Weiblich"),
    DIVERS("Divers");

    public final String displayValue;

    Gender(String displayValue) {
        this.displayValue = displayValue;
    }

    public String getDisplayValue() {
        return displayValue;
    }
}
