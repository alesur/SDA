package FastFoodFactory.FoodBuilder.Ingredients.SausageType;

import FastFoodFactory.FoodBuilder.TextLine;

public class Beef implements Sausage {

    @Override
    public String getSausage() {
        return "Beef" + TextLine.sausageLine();
    }


}
