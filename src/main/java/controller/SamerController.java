package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SamerController {

    @GetMapping("/")
    public String welcome(Model model) {
        // Lägg till data i modellen för startsidan
        model.addAttribute("pageTitle", "Välkommen");
        return "welcome"; // Visar startsidan
    }

    @GetMapping("/about")
    public String about(Model model) {
        // Lägger till data i modellen för "Om mig"-sidan
        model.addAttribute("pageTitle", "Om mig");
        model.addAttribute("name", "Samer");
        model.addAttribute("description", "En passionerad programmerare som älskar att koda, lyssna på musik och drömma mig bort till en Java-värld lång bort härifrån.");
        return "about"; // Visa "Om mig"-sidan
    }

    @GetMapping("/interests")
    public String interests(Model model) {
        // Lägger till data i modellen för "Mina intressen"-sidan
        model.addAttribute("pageTitle", "Mina intressen");
        model.addAttribute("interest1", "Programmering");
        model.addAttribute("interest2", "Musik");
        model.addAttribute("interest3", "Fotboll");
        return "interests"; // Visa "Mina intressen"-sidan
    }

    @GetMapping("/music")
    public String music(Model model) {
        // Lägger till data i modellen för "Min musiksmak"-sidan
        model.addAttribute("pageTitle", "Min musiksmak");
        model.addAttribute("artist1", "Britney Spears");
        model.addAttribute("artist2", "Bob Marley");
        model.addAttribute("artist3", "MJ");
        return "music"; // Visa "Min musiksmak"-sidan
    }

    @GetMapping("/contact")
    public String contact(Model model) {
        // Lägger till data i modellen för "Kontakt"-sidan
        model.addAttribute("pageTitle", "Kontakt");
        model.addAttribute("email", "samerskayir@gmail.com");
        return "contact"; // Visa "Kontakt"-sidan
    }
}
