package FastFoodFactory.FoodBuilder.Ingredients.VegetablesType;

import FastFoodFactory.FoodBuilder.TextLine;

public class Tomatoe implements Vegetables {

    @Override
    public String getVegetables() {
        return TextLine.vegetablesLine() + "tomatoes";
    }
}
