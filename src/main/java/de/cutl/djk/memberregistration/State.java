package de.cutl.djk.memberregistration;

public enum State {

    ACTIVE("Aktiv"),
    PASSIV("Passiv");

    final String displayValue;

    State(String displayValue) {
        this.displayValue = displayValue;
    }

    public String getDisplayValue() {
        return displayValue;
    }
}
