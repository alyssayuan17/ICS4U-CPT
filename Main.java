import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    // breakfast recipes
    static Recipe veggieBagelSandwich, beanVeggieScramble, greenEggScramble, redOrangeVeggieSalad, pancakes, crustlessQuiche, steakAndEggs, smokedSalmonBagel, turkeyBaconAndEggs;
    // lunch recipes
    static Recipe veggieWrap, edamameSpinachSalad, spinachAvocadoSalad, redOrangeLunchSalad, BLTSandwich, eggSaladLettuceWrap, beefBurger, tunaMeltSandwich, chickenCaesarSalad;
    // dinner recipes
    static Recipe vegetarianPizza, riceAndBeans, gardenSalad, moroccanBeetSalad, spaghettiBolognese, eggCasserole, steak, smokedSalmon, bakedChickenBreast;

    static Scanner in = new Scanner(System.in);
    static Account myAccount = new Account("");
    static Recipe breakfast; 
    static Recipe lunch; 
    static Recipe dinner; 
    static HashMap <String, Ingredient> groceryList = new HashMap <>();
    static HashMap <String, String> unitsGuide =  new HashMap <>();

    public static void main(String[] args) {

        String[][] ingredientUnits = {
            {"all-purpose flour", "cup(s)"},
            {"arugula", "cup(s)"},
            {"avocado", ""},
            {"bacon slices", ""},
            {"bagel", ""},
            {"baking powder", "tsp"},
            {"beef patty", ""},
            {"bell pepper", ""},
            {"black beans", "can(s)"},
            {"black beans (cooked, rinsed)", "cup(s)"},
            {"black olives", "cup(s)"},
            {"black pepper", "tsp"},
            {"bread slices", ""},
            {"burger bun", ""},
            {"butter", "tbsp"},
            {"canned tuna (in water, drained)", "cup(s)"},
            {"carrot", ""},
            {"caesar dressing", "tbsp"},
            {"cheddar cheese", "cup(s)"},
            {"cherry tomatoes", "cup(s)"},
            {"chives", "tbsp"},
            {"cilantro", "tbsp"},
            {"cream cheese", "tbsp"},
            {"croutons", "cup(s)"},
            {"cucumber", "slice(s)"},
            {"cumin", "tbsp"},
            {"dijon mustard", "tsp"},
            {"egg whites", ""},
            {"eggs", ""},
            {"garlic", "clove(s)"},
            {"garlic powder", "tsp"},
            {"grilled chicken breast", "g"},
            {"green onion", "tbsp"},
            {"hard-boiled eggs", ""},
            {"hummus", "tbsp"},
            {"kale", "cup(s)"},
            {"ketchup", "tbsp"},
            {"lemon juice", "tbsp"},
            {"lemon juice/vinegar", "tbsp"},
            {"lemon wedge", ""},
            {"lemon wedges", ""},
            {"lettuce", ""},
            {"mayonnaise", "tbsp"},
            {"milk", "cup(s)"},
            {"mozzarella cheese", "cup(s)"},
            {"mushrooms", "cup(s)"},
            {"mustard", "tsp"},
            {"olive oil", "tsp"},
            {"onion", ""},
            {"orange bell pepper", ""},
            {"paprika", "tsp"},
            {"parmesan cheese (shaved)", "tbsp"},
            {"pizza dough", "g"},
            {"red bell pepper", ""},
            {"red onion", "tbsp"},
            {"red wine vinegar", "tbsp"},
            {"romaine lettuce", "cup(s)"},
            {"romaine/mixed greens", "cup(s)"},
            {"salt", "tsp"},
            {"smoked salmon", "g"},
            {"spaghetti", "g"},
            {"spinach", "cup(s)"},
            {"sugar", "tbsp"},
            {"tomato", "slice(s)"},
            {"tomato paste", "tbsp"},
            {"tomato sauce", "cup(s)"},
            {"tortilla wrap", ""},
            {"vegetable broth", "cup(s)"},
            {"white/brown rice", "cup(s)"}
        };
    
        for (int i = 0; i < ingredientUnits.length; i++) {
            String name = ingredientUnits[i][0];
            String units = ingredientUnits[i][1];
            unitsGuide.put(name, units);
        }

        HashMap <String, Recipe> recipes = new HashMap<>();

        // create ArrayList for recipe ingredients

        // breakfast
        ArrayList<Ingredient> arrVeggieBagelSandwich = new ArrayList<>(); // veg, carbs
        arrVeggieBagelSandwich.add(new Ingredient("Bagel", "1"));
        arrVeggieBagelSandwich.add(new Ingredient("Cream cheese", "2 tbsp"));
        arrVeggieBagelSandwich.add(new Ingredient("Tomato", "2 slice(s)"));
        arrVeggieBagelSandwich.add(new Ingredient("Cucumber", "3 slice(s)"));
        arrVeggieBagelSandwich.add(new Ingredient("Lettuce", "1"));
        arrVeggieBagelSandwich.add(new Ingredient("Olive oil", "1 tsp"));
        arrVeggieBagelSandwich.add(new Ingredient("Salt", "0.25 tsp"));
        arrVeggieBagelSandwich.add(new Ingredient("Black pepper", "0.25 tsp"));

        ArrayList<Ingredient> arrBeanVeggieScramble = new ArrayList<>(); // veg, low carbs, beans
        arrBeanVeggieScramble.add(new Ingredient("Egg whites", "3"));  
        arrBeanVeggieScramble.add(new Ingredient("Black beans (cooked, rinsed)", "0.25 cup(s)"));  
        arrBeanVeggieScramble.add(new Ingredient("Spinach", "0.5 cup(s)"));  
        arrBeanVeggieScramble.add(new Ingredient("Bell pepper", "0.25"));  
        arrBeanVeggieScramble.add(new Ingredient("Onion", "0.25"));  
        arrBeanVeggieScramble.add(new Ingredient("Garlic", "1 clove(s)"));  
        arrBeanVeggieScramble.add(new Ingredient("Olive oil", "1 tsp"));  

        ArrayList<Ingredient> arrGreenEggScramble = new ArrayList<>(); // veg, low carbs, no beans, greens
        arrGreenEggScramble.add(new Ingredient("Eggs", "2"));
        arrGreenEggScramble.add(new Ingredient("Egg whites", "2"));
        arrGreenEggScramble.add(new Ingredient("Spinach", "1 cup(s)"));
        arrGreenEggScramble.add(new Ingredient("Kale", "0.5 cup(s)"));
        arrGreenEggScramble.add(new Ingredient("Mushrooms", "0.25 cup(s)"));
        arrGreenEggScramble.add(new Ingredient("Olive oil", "1 tsp"));
        arrGreenEggScramble.add(new Ingredient("Salt", "0.25 tsp"));
        arrGreenEggScramble.add(new Ingredient("Black pepper", "0.25 tsp"));

        ArrayList<Ingredient> arrRedOrangeVeggieSalad = new ArrayList<>(); // veg, low carbs, no beans, red + orange
        arrRedOrangeVeggieSalad.add(new Ingredient("Red bell pepper", "1"));
        arrRedOrangeVeggieSalad.add(new Ingredient("Carrot", "1"));
        arrRedOrangeVeggieSalad.add(new Ingredient("Cherry tomatoes", "0.5 cup(s)"));
        arrRedOrangeVeggieSalad.add(new Ingredient("Orange bell pepper", "0.5"));
        arrRedOrangeVeggieSalad.add(new Ingredient("Olive oil", "1 tbsp"));
        arrRedOrangeVeggieSalad.add(new Ingredient("Red wine vinegar", "1 tbsp"));
        arrRedOrangeVeggieSalad.add(new Ingredient("Salt", "0.25 tsp"));
        arrRedOrangeVeggieSalad.add(new Ingredient("Black pepper", "0.25 tsp"));

        ArrayList <Ingredient> arrPancakes = new ArrayList<>(); // not veg, no meat pref, no veg pref, carbs
        arrPancakes.add(new Ingredient("All-purpose flour", "1 cup(s)"));
        arrPancakes.add(new Ingredient("Milk", "0.75 cup(s)"));
        arrPancakes.add(new Ingredient("Egg", "1"));
        arrPancakes.add(new Ingredient("Baking powder", "2 tsp"));
        arrPancakes.add(new Ingredient("Sugar", "2 tbsp"));
        arrPancakes.add(new Ingredient("Salt", "0.25 tsp"));

        ArrayList<Ingredient> arrCrustlessQuiche = new ArrayList<>(); // not veg, no meat pref, no veg pref, low carbs
        arrCrustlessQuiche.add(new Ingredient("Eggs", "3"));
        arrCrustlessQuiche.add(new Ingredient("Heavy cream", "0.25 cup(s)"));
        arrCrustlessQuiche.add(new Ingredient("Cheddar cheese", "0.5 cup(s)"));
        arrCrustlessQuiche.add(new Ingredient("Spinach", "0.5 cup(s)"));
        arrCrustlessQuiche.add(new Ingredient("Mushrooms", "0.25 cup(s)"));
        arrCrustlessQuiche.add(new Ingredient("Salt", "0.25 tsp"));
        arrCrustlessQuiche.add(new Ingredient("Black pepper", "0.25 tsp"));

        ArrayList<Ingredient> arrSteakAndEggs = new ArrayList<>(); // not veg, pref meat, red meat
        arrSteakAndEggs.add(new Ingredient("Striploin steak", "1"));
        arrSteakAndEggs.add(new Ingredient("Eggs", "2"));
        arrSteakAndEggs.add(new Ingredient("Butter", "1 tbsp"));
        arrSteakAndEggs.add(new Ingredient("Salt", "0.5 tsp"));
        arrSteakAndEggs.add(new Ingredient("Black pepper", "0.25 tsp"));

        ArrayList<Ingredient> arrSmokedSalmonBagel = new ArrayList<>(); // not veg, pref meat, seafood
        arrSmokedSalmonBagel.add(new Ingredient("Bagel", "1"));
        arrSmokedSalmonBagel.add(new Ingredient("Cream cheese", "2 tbsp"));
        arrSmokedSalmonBagel.add(new Ingredient("Smoked salmon", "75 g"));
        arrSmokedSalmonBagel.add(new Ingredient("Cucumber", "3 slice(s)"));
        arrSmokedSalmonBagel.add(new Ingredient("Red onion", "2 tbsp"));
        arrSmokedSalmonBagel.add(new Ingredient("Lemon wedge", "1"));

        ArrayList<Ingredient> arrTurkeyBaconAndEggs = new ArrayList<>(); // not veg, pref meat, poultry
        arrTurkeyBaconAndEggs.add(new Ingredient("Turkey bacon", "3 slice(s)"));
        arrTurkeyBaconAndEggs.add(new Ingredient("Eggs", "2"));
        arrTurkeyBaconAndEggs.add(new Ingredient("Butter", "1 tbsp"));
        arrTurkeyBaconAndEggs.add(new Ingredient("Salt", "0.25 tsp"));
        arrTurkeyBaconAndEggs.add(new Ingredient("Black pepper", "0.25 tsp"));

        // create breakfast recipes
        recipes.put("veggie bagel sandwich", new Recipe("Veggie bagel sandwich", arrVeggieBagelSandwich));
        recipes.put("bean veggie scramble", new Recipe("Bean veggie scramble", arrBeanVeggieScramble));
        recipes.put("green egg scramble", new Recipe("Green egg scramble", arrGreenEggScramble));
        recipes.put("red orange veggie salad", new Recipe("Red orange veggie salad", arrRedOrangeVeggieSalad));
        recipes.put("pancakes", new Recipe("Pancakes", arrPancakes));
        recipes.put("crustless quiche", new Recipe("Crustless quiche", arrCrustlessQuiche));
        recipes.put("steak and eggs", new Recipe("Steak and eggs", arrSteakAndEggs));
        recipes.put("smoked salmon bagel", new Recipe("Smoked salmon bagel", arrSmokedSalmonBagel));
        recipes.put("turkey bacon and eggs", new Recipe("Turkey bacon and eggs", arrTurkeyBaconAndEggs));


        // lunch
        ArrayList<Ingredient> arrVeggieWrap = new ArrayList<>(); // veg, carbs
        arrVeggieWrap.add(new Ingredient("Tortilla wrap", "1"));
        arrVeggieWrap.add(new Ingredient("Hummus", "2 tbsp"));
        arrVeggieWrap.add(new Ingredient("Lettuce", "2"));
        arrVeggieWrap.add(new Ingredient("Tomato", "2 slice(s)"));
        arrVeggieWrap.add(new Ingredient("Cucumber", "4 slice(s)"));
        arrVeggieWrap.add(new Ingredient("Bell pepper", "0.25"));
        arrVeggieWrap.add(new Ingredient("Olive oil", "1 tsp"));
        arrVeggieWrap.add(new Ingredient("Salt", "0.25 tsp"));
        arrVeggieWrap.add(new Ingredient("Black pepper", "0.25 tsp"));

        ArrayList<Ingredient> arrEdamameSpinachSalad = new ArrayList<>(); // veg, low carbs, beans
        arrEdamameSpinachSalad.add(new Ingredient("Shelled edamame", "0.5 cup(s)"));
        arrEdamameSpinachSalad.add(new Ingredient("Spinach", "2 cup(s)"));
        arrEdamameSpinachSalad.add(new Ingredient("Cucumber", "0.5"));
        arrEdamameSpinachSalad.add(new Ingredient("Red bell pepper", "0.25"));
        arrEdamameSpinachSalad.add(new Ingredient("Olive oil", "1 tbsp"));
        arrEdamameSpinachSalad.add(new Ingredient("Lemon juice", "1 tbsp"));
        arrEdamameSpinachSalad.add(new Ingredient("Salt", "0.25 tsp"));
        arrEdamameSpinachSalad.add(new Ingredient("Black pepper", "0.25 tsp"));

        ArrayList<Ingredient> arrSpinachAvocadoSalad = new ArrayList<>(); // veg, low carbs, no beans, greens
        arrSpinachAvocadoSalad.add(new Ingredient("Spinach", "2 cup(s)"));
        arrSpinachAvocadoSalad.add(new Ingredient("Arugula", "1 cup(s)"));
        arrSpinachAvocadoSalad.add(new Ingredient("Avocado", "0.5"));
        arrSpinachAvocadoSalad.add(new Ingredient("Cucumber", "0.5"));
        arrSpinachAvocadoSalad.add(new Ingredient("Green onion", "2 tbsp"));
        arrSpinachAvocadoSalad.add(new Ingredient("Olive oil", "1 tbsp"));
        arrSpinachAvocadoSalad.add(new Ingredient("Lemon juice", "1 tbsp"));
        arrSpinachAvocadoSalad.add(new Ingredient("Salt", "0.25 tsp"));
        arrSpinachAvocadoSalad.add(new Ingredient("Black pepper", "0.25 tsp"));

        ArrayList<Ingredient> arrRedOrangeLunchSalad = new ArrayList<>(); // veg, low carbs, no beans, red + orange
        arrRedOrangeLunchSalad.add(new Ingredient("Red bell pepper", "1"));
        arrRedOrangeLunchSalad.add(new Ingredient("Carrot", "1"));
        arrRedOrangeLunchSalad.add(new Ingredient("Cherry tomatoes", "0.5 cup(s)"));
        arrRedOrangeLunchSalad.add(new Ingredient("Red onion", "2 tbsp"));
        arrRedOrangeLunchSalad.add(new Ingredient("Olive oil", "1 tbsp"));
        arrRedOrangeLunchSalad.add(new Ingredient("Lemon juice", "1 tbsp"));
        arrRedOrangeLunchSalad.add(new Ingredient("Salt", "0.25 tsp"));
        arrRedOrangeLunchSalad.add(new Ingredient("Black pepper", "0.25 tsp"));

        ArrayList<Ingredient> arrBLTSandwich = new ArrayList<>(); // not veg, no meat pref, no veg pref, carbs
        arrBLTSandwich.add(new Ingredient("Bread slices", "2"));
        arrBLTSandwich.add(new Ingredient("Bacon slices", "3"));
        arrBLTSandwich.add(new Ingredient("Lettuce leaves", "2"));
        arrBLTSandwich.add(new Ingredient("Tomato slices", "2"));
        arrBLTSandwich.add(new Ingredient("Mayonnaise", "1 tbsp"));

        ArrayList<Ingredient> arrEggSaladLettuceWrap = new ArrayList<>(); // not veg, no meat pref, no veg pref, low carbs
        arrEggSaladLettuceWrap.add(new Ingredient("Hard-boiled eggs", "2"));
        arrEggSaladLettuceWrap.add(new Ingredient("Mayonnaise", "2 tbsp"));
        arrEggSaladLettuceWrap.add(new Ingredient("Dijon mustard", "1 tsp"));
        arrEggSaladLettuceWrap.add(new Ingredient("Lettuce leaves", "4"));
        arrEggSaladLettuceWrap.add(new Ingredient("Chives", "1 tbsp"));
        arrEggSaladLettuceWrap.add(new Ingredient("Salt", "0.25 tsp"));
        arrEggSaladLettuceWrap.add(new Ingredient("Black pepper", "0.25 tsp"));

        ArrayList<Ingredient> arrBeefBurger = new ArrayList<>(); // not veg, pref meat, red meat
        arrBeefBurger.add(new Ingredient("Beef patty", "1"));
        arrBeefBurger.add(new Ingredient("Burger bun", "1"));
        arrBeefBurger.add(new Ingredient("Cheddar cheese", "1 slice(s)"));
        arrBeefBurger.add(new Ingredient("Lettuce", "1"));
        arrBeefBurger.add(new Ingredient("Tomato", "2 slice(s)"));
        arrBeefBurger.add(new Ingredient("Onion", "2"));
        arrBeefBurger.add(new Ingredient("Ketchup", "1 tbsp"));
        arrBeefBurger.add(new Ingredient("Mustard", "1 tsp"));

        ArrayList<Ingredient> arrTunaMeltSandwich = new ArrayList<>(); // not veg, pref meat, seafood
        arrTunaMeltSandwich.add(new Ingredient("Bread slices", "2"));
        arrTunaMeltSandwich.add(new Ingredient("Canned tuna (in water, drained)", "0.5 cup(s)"));
        arrTunaMeltSandwich.add(new Ingredient("Mayonnaise", "2 tbsp"));
        arrTunaMeltSandwich.add(new Ingredient("Cheddar cheese", "1 slice(s)"));
        arrTunaMeltSandwich.add(new Ingredient("Tomato", "2 slice(s)"));
        arrTunaMeltSandwich.add(new Ingredient("Butter", "1 tbsp"));

        ArrayList<Ingredient> arrChickenCaesarSalad = new ArrayList<>(); // not veg, pref meat, poultry
        arrChickenCaesarSalad.add(new Ingredient("Romaine lettuce", "2 cup(s)"));
        arrChickenCaesarSalad.add(new Ingredient("Grilled chicken breast", "100 g"));
        arrChickenCaesarSalad.add(new Ingredient("Parmesan cheese (shaved)", "2 tbsp"));
        arrChickenCaesarSalad.add(new Ingredient("Croutons", "0.25 cup(s)"));
        arrChickenCaesarSalad.add(new Ingredient("Caesar dressing", "2 tbsp"));
        arrChickenCaesarSalad.add(new Ingredient("Olive oil", "1 tsp"));
        arrChickenCaesarSalad.add(new Ingredient("Salt", "0.25 tsp"));
        arrChickenCaesarSalad.add(new Ingredient("Black pepper", "0.25 tsp"));

        // create lunch recipes
        recipes.put("veggie wrap", new Recipe("Veggie wrap", arrVeggieWrap));
        recipes.put("edamame spinach salad", new Recipe("Edamame spinach salad", arrEdamameSpinachSalad));
        recipes.put("spinach avocado salad", new Recipe("spinach avocado salad", arrSpinachAvocadoSalad));
        recipes.put("red orange lunch salad", new Recipe("Red orange lunch salad", arrRedOrangeLunchSalad));
        recipes.put("blt sandwich", new Recipe("BLT sandwich", arrBLTSandwich));
        recipes.put("egg salad lettuce wrap", new Recipe("Egg salad lettuce wrap", arrEggSaladLettuceWrap));
        recipes.put("beef burger", new Recipe("Beef burger", arrBeefBurger));
        recipes.put("tuna melt sandwich", new Recipe("Tuna melt sandwich", arrTunaMeltSandwich));
        recipes.put("chicken caesar salad", new Recipe("Chicken caesar salad", arrChickenCaesarSalad));


        // dinner
        ArrayList <Ingredient> arrVegetarianPizza = new ArrayList<>(); // veg, carbs
        arrVegetarianPizza.add(new Ingredient("Pizza dough", "250 g"));
        arrVegetarianPizza.add(new Ingredient("Tomato sauce", "0.25 cup(s)"));
        arrVegetarianPizza.add(new Ingredient("Mozzarella cheese", "0.5 cup(s)"));
        arrVegetarianPizza.add(new Ingredient("Mushrooms", "0.75 cup(s)"));
        arrVegetarianPizza.add(new Ingredient("Black olives", "0.25 cup(s)"));
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
        arrGardenSalad.add(new Ingredient("Red onion", "0.25"));
        arrGardenSalad.add(new Ingredient("Olive oil", "2 tbsp"));
        arrGardenSalad.add(new Ingredient("Lemon juice/vinegar", "1 tbsp"));
        
        ArrayList <Ingredient> arrMoroccanBeetSalad = new ArrayList<>(); // veg, low carbs, no beans, red + orange
        arrMoroccanBeetSalad.add(new Ingredient("Beets", "2"));
        arrMoroccanBeetSalad.add(new Ingredient("Olive oil", "2 tbsp"));
        arrMoroccanBeetSalad.add(new Ingredient("Lemon juice/vinegar", "1 tbsp"));
        arrMoroccanBeetSalad.add(new Ingredient("Garlic", "1 clove(s)"));
        arrMoroccanBeetSalad.add(new Ingredient("Cumin", "0.5 tbsp"));
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
        arrEggCasserole.add(new Ingredient("Milk", "0.25 cup(s)"));
        arrEggCasserole.add(new Ingredient("Cheddar cheese", "0.5 cup(s)"));
        arrEggCasserole.add(new Ingredient("Bell pepper", "0.5"));
        arrEggCasserole.add(new Ingredient("Spinach", "0.5"));
        arrEggCasserole.add(new Ingredient("Onion", "0.25"));
        
        ArrayList <Ingredient> arrSteak = new ArrayList<>(); // not veg, pref meat, red meat
        arrSteak.add(new Ingredient("Striploin steak","1"));
        arrSteak.add(new Ingredient("Salt","0.5 tbsp"));
        arrSteak.add(new Ingredient("Black pepper","0.5 tbsp"));
        arrSteak.add(new Ingredient("Olive oil","1 tbsp"));
        arrSteak.add(new Ingredient("Butter","1 tbsp"));
        arrSteak.add(new Ingredient("Garlic","2 clove(s)"));
        
        ArrayList <Ingredient> arrSmokedSalmon = new ArrayList<>(); // not veg, pref meat, seafood 
        arrSmokedSalmon.add(new Ingredient("Smoked salmon", "150 g"));
        arrSmokedSalmon.add(new Ingredient("Cream cheese", "2 tbsp"));
        arrSmokedSalmon.add(new Ingredient("Cucumber", "0.5"));
        arrSmokedSalmon.add(new Ingredient("Red onion", "0.25"));
        arrSmokedSalmon.add(new Ingredient("Lemon wedges", "2"));
        
        ArrayList <Ingredient> arrBakedChickenBreast = new ArrayList<>(); // not veg, pref meat, poultry
        arrBakedChickenBreast.add(new Ingredient("Chicken breasts", "2"));
        arrBakedChickenBreast.add(new Ingredient("Olive oil", "1 tbsp"));
        arrBakedChickenBreast.add(new Ingredient("Garlic powder", "0.5 tsp"));
        arrBakedChickenBreast.add(new Ingredient("Paprika", "0.5 tsp"));
        arrBakedChickenBreast.add(new Ingredient("Salt", "0.5 tsp"));
        arrBakedChickenBreast.add(new Ingredient("Black pepper", "0.25 tsp"));

        // create dinner recipes
        recipes.put("vegetarian pizza" , new Recipe("Vegetarian pizza", arrVegetarianPizza));
        recipes.put("rice and beans", new Recipe("Rice and beans", arrRiceAndBeans));
        recipes.put("garden salad", new Recipe("Garden salad", arrGardenSalad));
        recipes.put("moroccan beet salad", new Recipe("Moroccan beet salad", arrMoroccanBeetSalad));
        recipes.put("spaghetti bolognese", new Recipe("Spaghetti bolognese", arrSpaghettiBolognese));
        recipes.put("egg casserole", new Recipe("Egg casserole", arrEggCasserole));
        recipes.put("steak", new Recipe("Steak", arrSteak));
        recipes.put("smoked salmon", new Recipe("Smoked salmon", arrSmokedSalmon));        
        recipes.put("baked chicken breast", new Recipe("Baked chicken breast", arrBakedChickenBreast));


        // initiate program

        myAccount = Account.askForName(in); // call method to ask for name, store into static field
        String firstName = myAccount.getFirstName();
        String lastName = myAccount.getLastName();

        String again = "";
        myAccount.setRecipes(recipes);

        boolean breakfastPrint = false; 
        boolean lunchPrint = false; 
        boolean dinnerPrint = false; 
    
        do { // do-while loop to produce recipes until user wishes to exit/stop adding recipes
            
            // ask user to pick which meal to plan before calling survey method
            if (breakfastPrint == false && lunchPrint == false && dinnerPrint == false) {
                System.out.print("\nWhich meal would you like to plan? \n\ta) Breakfast \n\tb) Lunch \n\tc) Dinner \n\td) All three \nEnter: (a/b/c/d): ");
            } else {
                System.out.print("\nWhich meal would you like to plan? \n\ta) Breakfast \n\tb) Lunch \n\tc) Dinner \nEnter: (a/b/c): ");
            }
            String choice = ""; 
            choice = in.nextLine().trim().toLowerCase();

            System.out.println();

            if (!choice.equals("a") && !choice.equals("b") && !choice.equals("c") || choice.equals("d") && breakfastPrint == true || choice.equals("d") && lunchPrint == true || choice.equals("d") && dinnerPrint == true) {
                //invalid choice, do not ask for prefs 
            } else {
                myAccount = myAccount.askForPrefs(in, firstName, lastName); // now, call second account method to ask for user's preferences via survey
            }

            if (choice.equals("a")) {
                setBreakfast(); // if user chooses to plan breakfast, call method to plan their breakfast
                breakfastPrint = true; 
            } else if (choice.equals("b")) {
                setLunch(); //same for lunch 
                lunchPrint = true;
            } else if (choice.equals("c")) {
                setDinner();
                dinnerPrint = true; 
            } else if (choice.equals("d") && breakfastPrint == false && lunchPrint == false && dinnerPrint == false) {
                setBreakfast();
                setLunch();
                setDinner();
                breakfastPrint = true; 
                lunchPrint = true;
                dinnerPrint = true;
            } else if (choice.equals("d") && breakfastPrint == true || choice.equals("d") && lunchPrint == true || choice.equals("d") && dinnerPrint == true) {
                System.out.print("Invalid choice. Please enter one of the valid options listed: ");
            } else { // if user enters invalid inputs, loop until the input is accepted
                System.out.print("Invalid choice. Please enter one of the valid options listed: ");
            }

            System.out.println();

            // print only what user asked for
            if (!choice.equals("a") && !choice.equals("b") && !choice.equals("c") || choice.equals("d") && breakfastPrint == true || choice.equals("d") && lunchPrint == true || choice.equals("d") && dinnerPrint == true) {
                //if invalid, don't print. go straight to taking in input 
            } else {
                //valid, proceed
                System.out.println("\nCurrent Meal Plan:");
                if (breakfastPrint == true) {
                    System.out.println("Breakfast: " + breakfast.getName());
                }

                if (lunchPrint == true) {
                    System.out.println("Lunch: " + lunch.getName());
                }

                if (dinnerPrint == true) {
                    System.out.println("Dinner: " + dinner.getName());
                }

                if (breakfastPrint = true && lunchPrint == true && dinnerPrint == true) {
                    break;
                }

                System.out.print("\nPlan another meal? (y/n): ");
                again = in.nextLine().trim().toLowerCase();
            }

        } while (!again.equals("n")); // will only end if user wants to stop adding meals 

        System.out.println("\nHere are your meals for the day:");
        printMealsForTheDay(breakfastPrint, lunchPrint, dinnerPrint);

        System.out.println("\nWould you like to find another recipe by name? (y/n)");
        String searchRecipe = in.nextLine();

        if (searchRecipe.equalsIgnoreCase("y")) { // if user wants to search for recipe...
            Recipe foundRecipe = myAccount.findRecipeByName(); // call method to search for recipe 

            if (foundRecipe != null) { // if recipe is found...
                System.out.println("Recipe found: " + foundRecipe.getName()); // return the name of the found recipe 

            } else { // if no recipe is found...
                System.out.println("Recipe not found. Would you like to add a custom recipe? (y/n)"); // ask user if they want to add their own custome recipe
                String addRecipe = in.nextLine();

                if (addRecipe.equalsIgnoreCase("y")) {
                    myAccount.createCustomRecipe(unitsGuide); // if yes, call method
                } 

            }
        }
    }
    
    // based on user survey results we equate one of the recipes to equal each: breakfast, lunch, dinner

    public static void setBreakfast() {
        if (myAccount.isVegetarian()) {
            if (myAccount.isPreferCarbs()) {
                breakfast = veggieBagelSandwich;
            } else if (myAccount.isPreferAltProtein()) {
                breakfast = beanVeggieScramble;
            } else { // low carb, no alt protein --> pick veg by colour
                if (myAccount.getPreferVeg().equalsIgnoreCase("green")) {
                    breakfast = greenEggScramble;
                } else {
                    breakfast = redOrangeVeggieSalad;
                }
            }
        } else {
            String meat = myAccount.getPreferMeat().toLowerCase();
            if (meat.equalsIgnoreCase("red")) {
                breakfast = steakAndEggs;
            } else if (meat.equalsIgnoreCase("seafood")) {
                breakfast = smokedSalmonBagel;
            } else if (meat.equalsIgnoreCase("poultry")) {
                breakfast = turkeyBaconAndEggs;
            } else {
                if (meat.equalsIgnoreCase("carbs")) {
                    breakfast = pancakes;
                } else {
                    breakfast = crustlessQuiche;
                }
            }
        }
    }

    public static void setLunch() {
        if (myAccount.isVegetarian()) {
            if (myAccount.isPreferCarbs()) {
                lunch = veggieWrap;
            } else if (myAccount.isPreferAltProtein()) {
                lunch = edamameSpinachSalad;
            } else { // low carb, no alt protein --> pick veg by colour
                if (myAccount.getPreferVeg().equalsIgnoreCase("green")) {
                    lunch = spinachAvocadoSalad;
                } else {
                    lunch = redOrangeLunchSalad;
                }
            }
        } else {
            String meat = myAccount.getPreferMeat().toLowerCase();
            if (meat.equalsIgnoreCase("red")) {
                lunch = beefBurger;
            } else if (meat.equalsIgnoreCase("seafood")) {
                lunch = tunaMeltSandwich;
            } else if (meat.equalsIgnoreCase("poultry")) {
                lunch = chickenCaesarSalad;
            } else {
                if (meat.equalsIgnoreCase("carbs")) {
                    lunch = BLTSandwich;
                } else {
                    lunch = eggSaladLettuceWrap;
                }
            }
        }
    }

    public static void setDinner() {
        if (myAccount.isVegetarian()) {
            if (myAccount.isPreferCarbs()) {
                dinner = vegetarianPizza;
            } else if (myAccount.isPreferAltProtein()) {
                dinner = riceAndBeans;
            } else { // low carb, no alt protein --> pick veg by colour
                if (myAccount.getPreferVeg().equalsIgnoreCase("green")) {
                    dinner = gardenSalad;
                } else {
                    dinner = moroccanBeetSalad;
                }
            }
        } else {
            String meat = myAccount.getPreferMeat().toLowerCase();
            if (meat.equalsIgnoreCase("red")) {
                dinner = steak;
            } else if (meat.equalsIgnoreCase("seafood")) {
                dinner = smokedSalmon;
            } else if (meat.equalsIgnoreCase("poultry")) {
                dinner = bakedChickenBreast;
            } else {
                if (meat.equalsIgnoreCase("carbs")) {
                    dinner = spaghettiBolognese;
                } else {
                    dinner = eggCasserole;
                }
            }
        }
    }

    public static HashMap <String, Integer> createGroceryList(boolean printBreakfast, boolean printLunch, boolean printDinner, ArrayList <Ingredient> breakfastList, ArrayList <Ingredient> lunchList, ArrayList <Ingredient> dinnerList) {

      HashMap <String, Integer> groceryList = new HashMap <>();
      if (printBreakfast == true) {
          addToGroceryList(breakfastList);
        } 
        if (printLunch == true) {
          addToGroceryList(lunchList);
        }
        if (printDinner == true) {
          addToGroceryList(dinnerList);
        }
        return groceryList;
    }

    public static void addToGroceryList (ArrayList <Ingredient> breakfast) {
        for (Ingredient i : breakfast) {

            String name = i.getName();
            String qty = i.getQty();

            if (groceryList.containsKey(name)) {

                Ingredient fromList = groceryList.get(name);
                String qtyFromList = fromList.getQty();

                String [] arrQtyFromList = qtyFromList.split(" ");
                double numQtyFromList = Double.parseDouble(arrQtyFromList[0]);
                double numQtyToAdd = Double.parseDouble(qty.split(" ")[0]);

                String temp = String.valueOf(numQtyFromList + numQtyToAdd);
                if (arrQtyFromList.length > 1) {
                    for (int j = 1; j < arrQtyFromList.length-1; j++) {
                        temp += " " + arrQtyFromList[j];
                    }
                }
                fromList.setQty(temp);
                groceryList.replace(name, fromList);
            } else {
                groceryList.put(name, i); 
            }
        }
    }

    public static void printGroceryList() {
        System.out.println("GROCERY LIST:");
        System.out.println("\nINGREDIENTS: \n");
        for (String i : groceryList.keySet()) { //for each Ingredient object in the recipe's ingredient list 
            System.out.println("\t- " + i + ", " + groceryList.get(i) + " " + unitsGuide.get(i));
        }
    }



    public static void printMealsForTheDay(boolean breakfastPrint, boolean lunchPrint, boolean dinnerPrint) {
        if (breakfastPrint == true) {
        Recipe.printRecipe(breakfast);
        }
        if (lunchPrint == true) {
        Recipe.printRecipe(lunch);
        }
        if (dinnerPrint == true) {
        Recipe.printRecipe(dinner);
        }
    }
}