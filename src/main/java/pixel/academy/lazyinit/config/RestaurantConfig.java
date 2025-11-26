package pixel.academy.lazyinit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pixel.academy.lazyinit.common.*;

@Configuration
public class RestaurantConfig {

    @Bean("greekChef")
    public Chef greekChef() {
        return new GreekChef();
    }

    @Bean("frenchChef")
    public Chef frenchChef() {
        return new FrenchChef();
    }

    @Bean("italianChef")
    public Chef italianChef() {
        return new ItalianChef();
    }

    @Bean("mexicanChef")
    public Chef mexicanChef() {
        return new MexicanChef();
    }

    @Bean("turkishChef")
    public Chef turkishChef() {
        return new TurkishChef();
    }
}
