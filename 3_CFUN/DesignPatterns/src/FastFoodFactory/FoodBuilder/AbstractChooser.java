package FastFoodFactory.FoodBuilder;

public interface AbstractChooser<T> {
    T create(String type) ;
}