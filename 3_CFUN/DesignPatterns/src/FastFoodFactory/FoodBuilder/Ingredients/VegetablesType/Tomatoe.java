package HotDogFactory.FoodBuilder.VegetablesType;

import HotDogFactory.FoodBuilder.TextLine;

public class Tomatoe implements Vegetables {

    @Override
    public String getVegetables() {
        return TextLine.vegetablesLine() + "tomatoes";
    }
}
