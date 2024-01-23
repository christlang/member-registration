package de.cutl.djk.memberregistration;

public record Sepa(
        Address address,

        String iban,
        String bic,
        AnnualFee annualFee,
        AnnualFeeTennis annualFeeTennis
) {
}
