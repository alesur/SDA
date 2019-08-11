package FastFoodFactory.FoodBuilder.Ingredients;

import FastFoodFactory.FoodBuilder.AbstractChooser;
import FastFoodFactory.FoodBuilder.Ingredients.SausageType.Sausage;
import FastFoodFactory.FoodBuilder.Ingredients.SausageType.*;

public class SausageChooser implements AbstractChooser<Sausage> {

    @Override
    public Sausage create(String sausageType) {
        if ("Pork".equalsIgnoreCase(sausageType)) {
            return new Pork();
        }
        else if ("Beef".equalsIgnoreCase(sausageType)) {
            return new Beef();
        }
        else if ("Chicken".equalsIgnoreCase(sausageType)) {
            return new Chicken();
        }
        return null;
    }

}
