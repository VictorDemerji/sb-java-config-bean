package pixel.academy.lazyinit.common;

import org.springframework.context.annotation.Lazy;

@Lazy
public class GreekChef implements Chef{
    public GreekChef() {
        System.out.println("In constructoor: " +getClass().getSimpleName());
    }

    @Override
    public String getDailyRecipe() {
        return "Greek Salad";
    }
}
