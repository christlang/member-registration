package de.cutl.djk.memberregistration;

public record Address(
        String firstName,
        String lastName,
        String street,
        String houseNr,
        Integer plz,
        String city
) {
}
