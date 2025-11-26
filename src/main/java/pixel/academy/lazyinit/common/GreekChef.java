package pixel.academy.lazyinit.common;

public class GreekChef implements Chef{
    public GreekChef() {
        System.out.println("In constructoor: " +getClass().getSimpleName());
    }

    @Override
    public String getDailyRecipe() {
        return "Greek Salad";
    }
}
