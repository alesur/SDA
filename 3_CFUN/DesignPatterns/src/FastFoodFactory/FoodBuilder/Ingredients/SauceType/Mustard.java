package FastFoodFactory.FoodBuilder.Ingredients.SauceType;

import FastFoodFactory.FoodBuilder.TextLine;

public class Mustard implements Sauce{
    @Override
    public String getSauce() {
        return "mustart" + TextLine.sauceLine();
    }
}
