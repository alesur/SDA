package FastFoodFactory.FoodBuilder.Ingredients;

import FastFoodFactory.FoodBuilder.AbstractChooser;
import FastFoodFactory.FoodBuilder.Ingredients.VegetablesType.*;

public class VegetableChooser implements AbstractChooser<Vegetables> {

    @Override
    public Vegetables create(String vegetablesType) {
        if ("Cucumber".equalsIgnoreCase(vegetablesType)) {
            return new Cucumber();
        }
        else if ("Onion".equalsIgnoreCase(vegetablesType)) {
            return new Onion();
        }
        else if ("Tomatoe".equalsIgnoreCase(vegetablesType)) {
            return new Tomatoe();
        }

        return null;
    }

}