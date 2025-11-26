package pixel.academy.lazyinit.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pixel.academy.lazyinit.common.Chef;


@RestController
public class DemoController {

    private Chef myChef;
    @Autowired
    public DemoController(
            @Qualifier("batman") Chef theChef) {
            System.out.println("In constructor: " + getClass().getSimpleName());
        myChef = theChef;
    }

    @GetMapping("/dailyrecipe")
    public String getDailyRecipe() {
        return myChef.getDailyRecipe();
    }

}
