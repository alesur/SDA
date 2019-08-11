package FastFoodFactory.FoodBuilder.Ingredients.VegetablesType;

import FastFoodFactory.FoodBuilder.TextLine;

public class Onion implements Vegetables {

    @Override
    public String getVegetables() {
        return TextLine.vegetablesLine() + "onion";
    }
}
