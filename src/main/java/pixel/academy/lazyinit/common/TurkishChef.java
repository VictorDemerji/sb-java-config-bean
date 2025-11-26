package pixel.academy.lazyinit.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class TurkishChef implements Chef {

    public TurkishChef() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyRecipe() {
        return "Prepara un kebab cu carne de miel, servit cu pilaf de orez si iaurt!";
    }
}