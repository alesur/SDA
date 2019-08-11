package FastFoodFactory;

import FastFoodFactory.FoodBuilder.AbstractChooser;
import FastFoodFactory.FoodBuilder.IngredientProvider;
import FastFoodFactory.FoodBuilder.Ingredients.PattieType.Pattie;
import FastFoodFactory.FoodBuilder.Ingredients.SauceType.Sauce;
import FastFoodFactory.FoodBuilder.Ingredients.SausageType.Sausage;
import FastFoodFactory.FoodBuilder.Ingredients.VegetablesType.Vegetables;

public class Client {
    public static void main(String[] args) {
        AbstractChooser abstractChooser;

        abstractChooser = IngredientProvider.getChoose("HotDog");
        Sausage sausage = (Sausage) abstractChooser.create("Pork");
       // Pattie pattie = (Pattie) abstractChooser.create("Pork");

        abstractChooser = IngredientProvider.getChoose("Sauce");
        Sauce sauce = (Sauce) abstractChooser.create("Ketchup");

        abstractChooser = IngredientProvider.getChoose("Vegetables");
        Vegetables vegetables = (Vegetables) abstractChooser.create("Cucumber");

        String order = sausage.getSausage()
                //  pattie.getPattie()
                + sauce.getSauce()
                + vegetables.getVegetables();

        System.out.println(order);
    }
}
