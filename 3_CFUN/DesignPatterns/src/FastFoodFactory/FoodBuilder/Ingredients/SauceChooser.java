package FastFoodFactory.FoodBuilder.Ingredients;

import FastFoodFactory.FoodBuilder.AbstractChooser;
import FastFoodFactory.FoodBuilder.Ingredients.SauceType.Sauce;
import FastFoodFactory.FoodBuilder.Ingredients.SauceType.*;

public class SauceChooser implements AbstractChooser<Sauce> {

    @Override
    public Sauce create(String sauceType) {
        if ("Ketchup".equalsIgnoreCase(sauceType)) {
            return new Ketchup();
        }
        else if ("Mayo".equalsIgnoreCase(sauceType)) {
            return new Mayo();
        }
        else if ("Mustard".equalsIgnoreCase(sauceType)) {
            return new Mustard();
        }

        return null;
    }

}
