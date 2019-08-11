package FastFoodFactory.FoodBuilder.Ingredients.SauceType;

import FastFoodFactory.FoodBuilder.TextLine;

public class Ketchup implements Sauce {
    @Override
    public String getSauce() {
        return "ketchup" + TextLine.sauceLine();
    }


}
