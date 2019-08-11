package FastFoodFactory.FoodBuilder.Ingredients.PattieType;

import FastFoodFactory.FoodBuilder.TextLine;

public class Pork implements Pattie {

    @Override
    public String getPattie() {
        return "pork" + TextLine.pattieLine();
    }


}
