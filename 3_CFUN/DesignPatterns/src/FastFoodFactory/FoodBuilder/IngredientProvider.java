package FastFoodFactory.FoodBuilder;

import FastFoodFactory.FoodBuilder.Ingredients.PattieChooser;
import FastFoodFactory.FoodBuilder.Ingredients.SauceChooser;
import FastFoodFactory.FoodBuilder.Ingredients.SausageChooser;
import FastFoodFactory.FoodBuilder.Ingredients.VegetableChooser;

public class IngredientProvider {
    public static AbstractChooser getChoose(String choice){
        
        if("HotDog".equalsIgnoreCase(choice)){
            System.out.print("HotDog " + TextLine.requestLine());
            return new SausageChooser();
        }
        else if ("Burger".equalsIgnoreCase(choice)){
            System.out.print("Burger " + TextLine.requestLine());
            return new PattieChooser();
        }
        else if("Sauce".equalsIgnoreCase(choice)){
            return new SauceChooser();
        }
        else if("Vegetables".equalsIgnoreCase(choice)){
            return new VegetableChooser();
        }
        return null;

    }

}