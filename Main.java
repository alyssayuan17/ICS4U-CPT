import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    static Scanner in = new Scanner(System.in);
    static Account myAccount = Account.accountSetupAndPreferenceSurvey();

    public static void main(String[] args) {

        String[][] units = {
            {"All-purpose flour", "cup(s)"},
            {"Arugula", "cup(s)"},
            {"Avocado", ""},
            {"Bacon slices", ""},
            {"Bagel", ""},
            {"Baking powder", "tsp"},
            {"Beef patty", ""},
            {"Bell pepper", ""},
            {"Black beans", "can(s)"},
            {"Black beans (cooked, rinsed)", "cup(s)"},
            {"Black olives", "cup(s)"},
            {"Black pepper", "tsp"},
            {"Bread slices", ""},
            {"Burger bun", ""},
            {"Butter", "tbsp"},
            {"Canned tuna (in water, drained)", "cup(s)"},
            {"Carrot", ""},
            {"Caesar dressing", "tbsp"},
            {"Cheddar cheese", "cup(s)"},
            {"Cherry tomatoes", "cup(s)"},
            {"Chives", "tbsp"},
            {"Cilantro", "tbsp"},
            {"Cream cheese", "tbsp"},
            {"Croutons", "cup(s)"},
            {"Cucumber", "slice(s)"},
            {"Cumin", "tbsp"},
            {"Dijon mustard", "tsp"},
            {"Egg whites", ""},
            {"Eggs", ""},
            {"Garlic", "clove(s)"},
            {"Garlic powder", "tsp"},
            {"Grilled chicken breast", "g"},
            {"Green onion", "tbsp"},
            {"Hard-boiled eggs", ""},
            {"Hummus", "tbsp"},
            {"Kale", "cup(s)"},
            {"Ketchup", "tbsp"},
            {"Lemon juice", "tbsp"},
            {"Lemon juice/vinegar", "tbsp"},
            {"Lemon wedge", ""},
            {"Lemon wedges", ""},
            {"Lettuce", ""},
            {"Mayonnaise", "tbsp"},
            {"Milk", "cup(s)"},
            {"Mozzarella cheese", "cup(s)"},
            {"Mushrooms", "cup(s)"},
            {"Mustard", "tsp"},
            {"Olive oil", "tsp"},
            {"Onion", ""},
            {"Orange bell pepper", ""},
            {"Paprika", "tsp"},
            {"Parmesan cheese (shaved)", "tbsp"},
            {"Pizza dough", "g"},
            {"Red bell pepper", ""},
            {"Red onion", "tbsp"},
            {"Red wine vinegar", "tbsp"},
            {"Romaine lettuce", "cup(s)"},
            {"Romaine/mixed greens", "cup(s)"},
            {"Salt", "tsp"},
            {"Smoked salmon", "g"},
            {"Spaghetti", "g"},
            {"Spinach", "cup(s)"},
            {"Sugar", "tbsp"},
            {"Tomato", "slice(s)"},
            {"Tomato paste", "tbsp"},
            {"Tomato sauce", "cup(s)"},
            {"Tortilla wrap", ""},
            {"Vegetable broth", "cup(s)"},
            {"White/brown rice", "cup(s)"}
        };

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
        Recipe veggieBagelSandwich = new Recipe("Veggie bagel sandwich", arrVeggieBagelSandwich);
        Recipe beanVeggieScramble = new Recipe("Bean veggie scramble", arrBeanVeggieScramble);
        Recipe greenEggScramble = new Recipe("Green egg scramble", arrGreenEggScramble);
        Recipe redOrangeVeggieSalad = new Recipe("Red orange veggie salad", arrRedOrangeVeggieSalad);
        Recipe pancakes = new Recipe("Pancakes", arrPancakes);
        Recipe crustlessQuiche = new Recipe("Crustless quiche", arrCrustlessQuiche);
        Recipe steakAndEggs = new Recipe("Steak and eggs", arrSteakAndEggs);
        Recipe smokedSalmonBagel = new Recipe("Smoked salmon bagel", arrSmokedSalmonBagel);
        Recipe turkeyBaconAndEggs = new Recipe("Turkey bacon and eggs", arrTurkeyBaconAndEggs);


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
        arrEdamameSpinachSalad.add(new Ingredient("Red bell pepper", "0.25 (diced)"));
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
        Recipe veggieWrap = new Recipe("Veggie wrap", arrVeggieWrap);
        Recipe edamameSpinachSalad = new Recipe("Edamame spinach salad", arrEdamameSpinachSalad);
        Recipe spinachAvocadoSalad = new Recipe("Spinach avocado salad", arrSpinachAvocadoSalad);
        Recipe redOrangeLunchSalad = new Recipe("Red orange lunch salad", arrRedOrangeLunchSalad);
        Recipe BLTSandwich = new Recipe("BLT sandwich", arrBLTSandwich);
        Recipe eggSaladLettuceWrap = new Recipe("Egg salad lettuce wrap", arrEggSaladLettuceWrap);
        Recipe beefBurger = new Recipe("Beef burger", arrBeefBurger);
        Recipe tunaMeltSandwich = new Recipe("Tuna melt sandwich", arrTunaMeltSandwich);
        Recipe chickenCaesarSalad = new Recipe("Chicken caesar salad", arrChickenCaesarSalad);


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