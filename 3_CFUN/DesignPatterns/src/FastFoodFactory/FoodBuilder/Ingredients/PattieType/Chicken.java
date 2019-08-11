package FastFoodFactory.FoodBuilder.Ingredients.PattieType;

import FastFoodFactory.FoodBuilder.TextLine;

public class Chicken implements Pattie {

    @Override
    public String getPattie() {
        return "chicken" + TextLine.pattieLine();
    }
}
