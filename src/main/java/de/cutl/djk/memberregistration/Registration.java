package de.cutl.djk.memberregistration;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public record Registration(
        Gender gender,
        String country,
        @DateTimeFormat(pattern = "yyyy-MM-dd")
        Date dateOfBirth,
        String telephone,
        Address address,
        String email,
        Department department,
        State state
        ) {
}
