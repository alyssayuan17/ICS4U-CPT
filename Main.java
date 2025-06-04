import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    static Scanner in = new Scanner(System.in);
    static Account myAccount = Account.accountSetupAndPreferenceSurvey();

    public static void main(String[] args) {

        ArrayList <Ingredient> vegetarianPizza = new ArrayList<>(); // veg, carbs
        vegetarianPizza.add(new Ingredient("Pizza dough", "250 g"));
        vegetarianPizza.add(new Ingredient("Tomato sauce", "1/3 cup"));
        vegetarianPizza.add(new Ingredient("Mozzarella cheese", "1/2 cup"));
        vegetarianPizza.add(new Ingredient("Mushrooms", "3/4 cup"));
        vegetarianPizza.add(new Ingredient("Black olives", "1/4 cup"));
        vegetarianPizza.add(new Ingredient("Olive oil", "1 tbsp"));
        
        ArrayList <Ingredient> riceAndBeans = new ArrayList<>(); // veg, low carbs, beans
        riceAndBeans.add(new Ingredient("rice", "210 g"));
        
        ArrayList <Ingredient> gardenSalad = new ArrayList<>(); // veg, low carbs, no beans, greens
        
        ArrayList <Ingredient> moroccanBeetSalad = new ArrayList<>(); // veg, low carbs, no beans, red + orange
        
        ArrayList <Ingredient> spaghettiBolognese = new ArrayList<>(); // not veg, no meat pref, no veg pref, carbs
        
        ArrayList <Ingredient> eggCasserole = new ArrayList<>(); // not veg, no meat pref, no veg pref, low carbs
        
        ArrayList <Ingredient> steak = new ArrayList<>(); // not veg, pref meat, red meat
        
        ArrayList <Ingredient> smokedSalmon = new ArrayList<>(); // not veg, pref meat, seafood 
        
        ArrayList <Ingredient> bakedChickenBreast = new ArrayList<>(); // not veg, pref meat, poultry

    }

}