package nz.nightwind.Cauldron.GreetingsExample;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String greetingForm(Model model) {
        model.addAttribute("greeting", new Greeting());
        Greeting g = (Greeting) model.getAttribute("greeting");

        assert g != null;
        System.out.println("Greeting Added: " + g.getContent());

        return "greeting";
    }

    @PostMapping("/greeting")
    public String greetingSubmit(@ModelAttribute Greeting greeting, Model model) {
        model.addAttribute("greeting", greeting);

        System.out.println("\nGreeting: " + greeting.getContent());

        for(String k : model.asMap().keySet()){
            System.out.println(k);
        }

        return "result";
    }
}
