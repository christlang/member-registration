package de.cutl.djk.memberregistration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.*;

@Controller
public class MembershipApplicationController {

    final RegistrationStore store;

    @Autowired
    public MembershipApplicationController(RegistrationStore store) {
        this.store = store;
    }


    @GetMapping("/")
    public String registrationForm(Model model) {
        Address address = new Address("", "", "", "", null, "");
        model.addAttribute("registration", new Registration( null, "", null, "", address, "", null, null));
        model.addAttribute("availableGender", Gender.values());
        model.addAttribute("availableCountries", getAvailableCountries());
        model.addAttribute("defaultCountry", "Deutschland");
        model.addAttribute("availableDepartments", Department.values());
        model.addAttribute("availableStates", State.values());
        return "application";
    }

    @PostMapping("/registration")
    public String registrationSubmit(@ModelAttribute Registration registration, Model model) {
        model.addAttribute("registration", registration);
        final UUID uuid = UUID.randomUUID();
        store.put(uuid, registration);
        model.addAttribute("id", uuid);
        return "applicationResult";
    }

    @GetMapping("/sepa")
    public String sepaForm(Model model, @RequestParam(value = "id", required = false) String id) {
        if (id == null) {
            return "redirect:/";
        }
        final Registration registration = store.get(UUID.fromString(id));

        model.addAttribute("sepa", new Sepa( registration.address(), "", null, null, null));

        if (registration.department() == Department.TENNIS) {
            model.addAttribute("showTennisFee", true);
            model.addAttribute("availableAnnualFeesTennis", AnnualFeeTennis.values());
            model.addAttribute("defaultFeeTennis", AnnualFeeTennis.ADULT);
        } else {
            model.addAttribute("showTennisFee", false);
            model.addAttribute("availableAnnualFees", AnnualFee.values());
            model.addAttribute("defaultFee", AnnualFee.ACTIVE_ADULT);
        }

        return "sepa";
    }

    @PostMapping("/sepa")
    public String sepaSubmit(@ModelAttribute Sepa sepa, Model model) {
        model.addAttribute("sepa", sepa);
        return "sepaResult";
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
