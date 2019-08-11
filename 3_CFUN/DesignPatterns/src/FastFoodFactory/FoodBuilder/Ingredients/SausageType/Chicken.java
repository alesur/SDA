package FastFoodFactory.FoodBuilder.Ingredients.SausageType;

import FastFoodFactory.FoodBuilder.TextLine;

public class Chicken implements Sausage {

    @Override
    public String getSausage() {
        return "chicken" + TextLine.sausageLine();
    }
}
