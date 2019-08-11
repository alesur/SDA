package FastFoodFactory.FoodBuilder.Ingredients.SausageType;

import FastFoodFactory.FoodBuilder.TextLine;

public class Pork implements Sausage {

    @Override
    public String getSausage() {
        return "pork" + TextLine.sausageLine();
    }


}
