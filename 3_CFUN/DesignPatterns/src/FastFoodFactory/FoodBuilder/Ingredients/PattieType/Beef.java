package FastFoodFactory.FoodBuilder.Ingredients.PattieType;

import FastFoodFactory.FoodBuilder.TextLine;

public class Beef implements Pattie {

    @Override
    public String getPattie() {
        return "Beef" + TextLine.pattieLine();
    }


}
