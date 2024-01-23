package de.cutl.djk.memberregistration;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

@Controller
public class RegistrationController {
    @GetMapping("/")
    public String registrationForm(Model model) {
        Address address = new Address("", "", "", "", null, "");
        model.addAttribute("registration", new Registration( null, "", null, "", address, "", null, null));
        model.addAttribute("availableGender", Gender.values());
        model.addAttribute("availableCountries", getAvailableCountries());
        model.addAttribute("defaultCountry", "Deutschland");
        model.addAttribute("availableDepartments", Department.values());
        model.addAttribute("availableStates", State.values());
        return "index";
    }

    @PostMapping("/registration")
    public String registrationSubmit(@ModelAttribute Registration registration, Model model) {
        model.addAttribute("registration", registration);
        return "result";
    }

    @GetMapping("/sepa")
    public String sepaForm(Model model) {
        Address address = new Address("", "", "", "", null, "");
        model.addAttribute("sepa", new Sepa( address, "", null, null));
        model.addAttribute("availableAnnualFees", AnnualFee.values());
        model.addAttribute("defaultFee", AnnualFee.ACTIVE_ADULT);
        return "sepa";
    }

    @PostMapping("/sepa")
    public String sepaSubmit(@ModelAttribute Registration registration, Model model) {
        model.addAttribute("registration", registration);
        return "result";
    }

    public List<String> getAvailableCountries() {
        List<String> countries = new ArrayList<>();

        Locale[] locales = Locale.getAvailableLocales();

        for (Locale locale : locales) {
            String country = locale.getDisplayCountry(Locale.GERMANY);

            if (!country.isEmpty() && !countries.contains(country)) {
                countries.add(country);
            }
        }
        Collections.sort(countries);
        return countries;
    }

}
