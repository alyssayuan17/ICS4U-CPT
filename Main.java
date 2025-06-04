import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    static Scanner in = new Scanner(System.in);
    static Account myAccount = Account.accountSetupAndPreferenceSurvey();

    public static void main(String[] args) {

        ArrayList <Ingredient> vegetarianPizza = new ArrayList<>(); // veg, carbs
        vegetarianPizza.add(new Ingredient("Pizza dough", "250 g"));
        vegetarianPizza.add(new Ingredient("Tomato sauce", "1/3 cup(s)"));
        vegetarianPizza.add(new Ingredient("Mozzarella cheese", "1/2 cup(s)"));
        vegetarianPizza.add(new Ingredient("Mushrooms", "3/4 cup(s)"));
        vegetarianPizza.add(new Ingredient("Black olives", "1/4 cup(s)"));
        vegetarianPizza.add(new Ingredient("Olive oil", "1 tbsp"));
        
        ArrayList <Ingredient> riceAndBeans = new ArrayList<>(); // veg, low carbs, beans
        riceAndBeans.add(new Ingredient("White/brown rice", "1 cup(s)"));
        riceAndBeans.add(new Ingredient("Black beans", "1 can(s)"));
        riceAndBeans.add(new Ingredient("Onion", "1"));
        riceAndBeans.add(new Ingredient("Garlic", "2 clove(s)"));
        riceAndBeans.add(new Ingredient("Olive oil", "1 tbsp"));
        riceAndBeans.add(new Ingredient("Vegetable broth", "2 cup(s)"));
        
        ArrayList <Ingredient> gardenSalad = new ArrayList<>(); // veg, low carbs, no beans, greens
        gardenSalad.add(new Ingredient("Romaine/mixed greens", "4 cup(s)"));
        gardenSalad.add(new Ingredient("Tomato", "1"));
        gardenSalad.add(new Ingredient("Cucumber", "1"));
        gardenSalad.add(new Ingredient("Red onion", "1/4"));
        gardenSalad.add(new Ingredient("Olive oil", "2 tbsp"));
        gardenSalad.add(new Ingredient("Lemon juice/vinegar", "1 tbsp"));
        
        ArrayList <Ingredient> moroccanBeetSalad = new ArrayList<>(); // veg, low carbs, no beans, red + orange
        moroccanBeetSalad.add(new Ingredient("Beets", "2"));
        moroccanBeetSalad.add(new Ingredient("Olive oil", "2 tbsp"));
        moroccanBeetSalad.add(new Ingredient("Lemon juice/vinegar", "1 tbsp"));
        moroccanBeetSalad.add(new Ingredient("Garlic", "1 clove(s)"));
        moroccanBeetSalad.add(new Ingredient("Cumin", "1/2 tbsp"));
        moroccanBeetSalad.add(new Ingredient("Cilantro", "2 tbsp"));
        
        ArrayList <Ingredient> spaghettiBolognese = new ArrayList<>(); // not veg, no meat pref, no veg pref, carbs
        spaghettiBolognese.add(new Ingredient("Spaghetti", "200 g"));
        spaghettiBolognese.add(new Ingredient("Olive oil", "1 tbsp"));
        spaghettiBolognese.add(new Ingredient("Onion", "1"));
        spaghettiBolognese.add(new Ingredient("Garlic", "2 clove(s)"));
        spaghettiBolognese.add(new Ingredient("Carrot", "1"));
        spaghettiBolognese.add(new Ingredient("Celery", "1"));
        spaghettiBolognese.add(new Ingredient("Crushed tomatoes", "1 can(s)"));
        spaghettiBolognese.add(new Ingredient("Tomato paste", "1 tbsp"));
        
        ArrayList <Ingredient> eggCasserole = new ArrayList<>(); // not veg, no meat pref, no veg pref, low carbs
        eggCasserole.add(new Ingredient("Eggs", "4"));
        eggCasserole.add(new Ingredient("Milk", "1/4 cup(s)"));
        eggCasserole.add(new Ingredient("Cheddar cheese", "1/2 cup(s)"));
        eggCasserole.add(new Ingredient("Bell pepper", "1/2"));
        eggCasserole.add(new Ingredient("Spinach", "1/2"));
        eggCasserole.add(new Ingredient("Onion", "1/4"));
        
        ArrayList <Ingredient> steak = new ArrayList<>(); // not veg, pref meat, red meat
        steak.add(new Ingredient("Striploin steak","1"));
        steak.add(new Ingredient("Salt","1/2 tbsp"));
        steak.add(new Ingredient("Black pepper","1/2 tbsp"));
        steak.add(new Ingredient("Olive oil","1 tbsp"));
        steak.add(new Ingredient("Butter","1 tbsp"));
        steak.add(new Ingredient("Garlic","2 clove(s)"));
        
        ArrayList <Ingredient> smokedSalmon = new ArrayList<>(); // not veg, pref meat, seafood 
        smokedSalmon.add(new Ingredient("Smoked salmon", "100–150g"));
        smokedSalmon.add(new Ingredient("Cream cheese", "2 tbsp"));
        smokedSalmon.add(new Ingredient("Cucumber", "1/2"));
        smokedSalmon.add(new Ingredient("Red onion", "1/4"));
        smokedSalmon.add(new Ingredient("Lemon wedges", "2"));
        
        ArrayList <Ingredient> bakedChickenBreast = new ArrayList<>(); // not veg, pref meat, poultry
        bakedChickenBreast.add(new Ingredient("Chicken breasts", "2"));
        bakedChickenBreast.add(new Ingredient("Olive oil", "1 tbsp"));
        bakedChickenBreast.add(new Ingredient("Garlic powder", "1/2 tsp"));
        bakedChickenBreast.add(new Ingredient("Paprika", "1/2 tsp"));
        bakedChickenBreast.add(new Ingredient("Salt", "1/2 tsp"));
        bakedChickenBreast.add(new Ingredient("Black pepper", "1/4 tsp"));

    }

}