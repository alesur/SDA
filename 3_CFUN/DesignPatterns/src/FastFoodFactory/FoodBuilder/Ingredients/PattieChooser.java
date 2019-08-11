package FastFoodFactory.FoodBuilder.Ingredients;

import FastFoodFactory.FoodBuilder.AbstractChooser;
import FastFoodFactory.FoodBuilder.Ingredients.PattieType.*;

public class PattieChooser implements AbstractChooser<Pattie> {

    @Override
    public Pattie create(String pattieType) {
        if ("Pork".equalsIgnoreCase(pattieType)) {
            return new Pork();
        }
        else if ("Beef".equalsIgnoreCase(pattieType)) {
            return new Beef();
        }
        else if ("Chicken".equalsIgnoreCase(pattieType)) {
            return new Chicken();
        }
        return null;
    }

}