import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    static Scanner in = new Scanner(System.in);
    static Account myAccount = Account.accountSetupAndPreferenceSurvey();

    public static void main(String[] args) {
        
        // create ArrayList for recipe ingredients
        ArrayList <Ingredient> arrVegetarianPizza = new ArrayList<>(); // veg, carbs
        arrVegetarianPizza.add(new Ingredient("Pizza dough", "250 g"));
        arrVegetarianPizza.add(new Ingredient("Tomato sauce", "1/3 cup(s)"));
        arrVegetarianPizza.add(new Ingredient("Mozzarella cheese", "1/2 cup(s)"));
        arrVegetarianPizza.add(new Ingredient("Mushrooms", "3/4 cup(s)"));
        arrVegetarianPizza.add(new Ingredient("Black olives", "1/4 cup(s)"));
        arrVegetarianPizza.add(new Ingredient("Olive oil", "1 tbsp"));
        
        ArrayList <Ingredient> arrRiceAndBeans = new ArrayList<>(); // veg, low carbs, beans
        arrRiceAndBeans.add(new Ingredient("White/brown rice", "1 cup(s)"));
        arrRiceAndBeans.add(new Ingredient("Black beans", "1 can(s)"));
        arrRiceAndBeans.add(new Ingredient("Onion", "1"));
        arrRiceAndBeans.add(new Ingredient("Garlic", "2 clove(s)"));
        arrRiceAndBeans.add(new Ingredient("Olive oil", "1 tbsp"));
        arrRiceAndBeans.add(new Ingredient("Vegetable broth", "2 cup(s)"));
        
        ArrayList <Ingredient> arrGardenSalad = new ArrayList<>(); // veg, low carbs, no beans, greens
        arrGardenSalad.add(new Ingredient("Romaine/mixed greens", "4 cup(s)"));
        arrGardenSalad.add(new Ingredient("Tomato", "1"));
        arrGardenSalad.add(new Ingredient("Cucumber", "1"));
        arrGardenSalad.add(new Ingredient("Red onion", "1/4"));
        arrGardenSalad.add(new Ingredient("Olive oil", "2 tbsp"));
        arrGardenSalad.add(new Ingredient("Lemon juice/vinegar", "1 tbsp"));
        
        ArrayList <Ingredient> arrMoroccanBeetSalad = new ArrayList<>(); // veg, low carbs, no beans, red + orange
        arrMoroccanBeetSalad.add(new Ingredient("Beets", "2"));
        arrMoroccanBeetSalad.add(new Ingredient("Olive oil", "2 tbsp"));
        arrMoroccanBeetSalad.add(new Ingredient("Lemon juice/vinegar", "1 tbsp"));
        arrMoroccanBeetSalad.add(new Ingredient("Garlic", "1 clove(s)"));
        arrMoroccanBeetSalad.add(new Ingredient("Cumin", "1/2 tbsp"));
        arrMoroccanBeetSalad.add(new Ingredient("Cilantro", "2 tbsp"));
        
        ArrayList <Ingredient> arrSpaghettiBolognese = new ArrayList<>(); // not veg, no meat pref, no veg pref, carbs
        arrSpaghettiBolognese.add(new Ingredient("Spaghetti", "200 g"));
        arrSpaghettiBolognese.add(new Ingredient("Olive oil", "1 tbsp"));
        arrSpaghettiBolognese.add(new Ingredient("Onion", "1"));
        arrSpaghettiBolognese.add(new Ingredient("Garlic", "2 clove(s)"));
        arrSpaghettiBolognese.add(new Ingredient("Carrot", "1"));
        arrSpaghettiBolognese.add(new Ingredient("Celery", "1"));
        arrSpaghettiBolognese.add(new Ingredient("Crushed tomatoes", "1 can(s)"));
        arrSpaghettiBolognese.add(new Ingredient("Tomato paste", "1 tbsp"));
        
        ArrayList <Ingredient> arrEggCasserole = new ArrayList<>(); // not veg, no meat pref, no veg pref, low carbs
        arrEggCasserole.add(new Ingredient("Eggs", "4"));
        arrEggCasserole.add(new Ingredient("Milk", "1/4 cup(s)"));
        arrEggCasserole.add(new Ingredient("Cheddar cheese", "1/2 cup(s)"));
        arrEggCasserole.add(new Ingredient("Bell pepper", "1/2"));
        arrEggCasserole.add(new Ingredient("Spinach", "1/2"));
        arrEggCasserole.add(new Ingredient("Onion", "1/4"));
        
        ArrayList <Ingredient> arrSteak = new ArrayList<>(); // not veg, pref meat, red meat
        arrSteak.add(new Ingredient("Striploin steak","1"));
        arrSteak.add(new Ingredient("Salt","1/2 tbsp"));
        arrSteak.add(new Ingredient("Black pepper","1/2 tbsp"));
        arrSteak.add(new Ingredient("Olive oil","1 tbsp"));
        arrSteak.add(new Ingredient("Butter","1 tbsp"));
        arrSteak.add(new Ingredient("Garlic","2 clove(s)"));
        
        ArrayList <Ingredient> arrSmokedSalmon = new ArrayList<>(); // not veg, pref meat, seafood 
        arrSmokedSalmon.add(new Ingredient("Smoked salmon", "100–150g"));
        arrSmokedSalmon.add(new Ingredient("Cream cheese", "2 tbsp"));
        arrSmokedSalmon.add(new Ingredient("Cucumber", "1/2"));
        arrSmokedSalmon.add(new Ingredient("Red onion", "1/4"));
        arrSmokedSalmon.add(new Ingredient("Lemon wedges", "2"));
        
        ArrayList <Ingredient> arrBakedChickenBreast = new ArrayList<>(); // not veg, pref meat, poultry
        arrBakedChickenBreast.add(new Ingredient("Chicken breasts", "2"));
        arrBakedChickenBreast.add(new Ingredient("Olive oil", "1 tbsp"));
        arrBakedChickenBreast.add(new Ingredient("Garlic powder", "1/2 tsp"));
        arrBakedChickenBreast.add(new Ingredient("Paprika", "1/2 tsp"));
        arrBakedChickenBreast.add(new Ingredient("Salt", "1/2 tsp"));
        arrBakedChickenBreast.add(new Ingredient("Black pepper", "1/4 tsp"));

        // create recipes
        Recipe vegetarianPizza = new Recipe("Vegetarian pizza", arrVegetarianPizza);
        Recipe riceAndBeans = new Recipe("Rice and beans", arrRiceAndBeans);
        Recipe gardenSalad = new Recipe("Garden salad", arrGardenSalad);
        Recipe moroccanBeetSalad = new Recipe("Moroccan beet salad", arrMoroccanBeetSalad);
        Recipe spaghettiBolognese = new Recipe("Spaghetti bolognese", arrSpaghettiBolognese);
        Recipe eggCasserole = new Recipe("Egg casserole", arrEggCasserole);
        Recipe steak = new Recipe("Steak", arrSteak);
        Recipe smokedSalmon = new Recipe("Smoked salmon", arrSmokedSalmon);        
        Recipe bakedChickenBreast = new Recipe("Baked chicken breast", arrBakedChickenBreast);

        // based on user survey results we equate one of the recipes to equal each: breakfast, lunch, dinner

    }

}