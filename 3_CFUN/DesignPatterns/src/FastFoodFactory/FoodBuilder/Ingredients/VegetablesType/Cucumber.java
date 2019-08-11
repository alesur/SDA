package FastFoodFactory.FoodBuilder.Ingredients.VegetablesType;

import FastFoodFactory.FoodBuilder.TextLine;

public class Cucumber implements Vegetables {

    @Override
    public String getVegetables() {
        return TextLine.vegetablesLine() + "cucumber";
    }
}

