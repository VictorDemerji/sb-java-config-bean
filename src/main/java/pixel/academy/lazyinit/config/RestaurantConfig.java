package pixel.academy.lazyinit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pixel.academy.lazyinit.common.Chef;
import pixel.academy.lazyinit.common.GreekChef;

@Configuration
public class RestaurantConfig {

    @Bean("batman")
    public Chef greekChef() {
        return new GreekChef();
    }
}
