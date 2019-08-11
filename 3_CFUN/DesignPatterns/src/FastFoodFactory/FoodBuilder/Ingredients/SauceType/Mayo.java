package FastFoodFactory.FoodBuilder.Ingredients.SauceType;

import FastFoodFactory.FoodBuilder.TextLine;

public class Mayo implements Sauce {

    @Override
    public String getSauce() {
        return "mayo" + TextLine.sauceLine();
    }

}
