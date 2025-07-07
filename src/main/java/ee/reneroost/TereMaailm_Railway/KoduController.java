package ee.reneroost.TereMaailm_Railway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KoduController {

    @GetMapping({"/", "/kodu", "/olek"})
    public String getOlek() {
        return "Rakendus on töötamas.";
    }
}
