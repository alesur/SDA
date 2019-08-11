package HotDogFactory.FoodBuilder.SausageType;

import HotDogFactory.FoodBuilder.TextLine;

public class Chicken implements Sausage {

    @Override
    public String getSausage() {
        return "chicken" + TextLine.sausageLine();
    }
}
