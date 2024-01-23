package de.cutl.djk.memberregistration;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public record Registration(
        String firstName,
        String lastName,
        Gender gender,
        String country,
        @DateTimeFormat(pattern = "yyyy-MM-dd")
        Date dateOfBirth,
        String telephone,
        String street,
        String houseNr,
        Integer plz,
        String city,
        String email,
        Department department,
        State state
        ) {
}
