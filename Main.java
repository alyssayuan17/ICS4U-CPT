import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    static Scanner in = new Scanner(System.in);
    static Account myAccount = Account.accountSetupAndPreferenceSurvey();

    static Recipe breakfast, lunch, dinner;
    // breakfast recipes
    static Recipe veggieBagelSandwich, beanVeggieScramble, greenEggScramble, redOrangeVeggieSalad, pancakes, crustlessQuiche, steakAndEggs, smokedSalmonBagel, turkeyBaconAndEggs;
    // lunch recipes
    static Recipe veggieWrap, edamameSpinachSalad, spinachAvocadoSalad, redOrangeLunchSalad, BLTSandwich, eggSaladLettuceWrap, beefBurger, tunaMeltSandwich, chickenCaesarSalad;
    // dinner recipes
    static Recipe vegetarianPizza, riceAndBeans, gardenSalad, moroccanBeetSalad, spaghettiBolognese, eggCasserole, steak, smokedSalmon, bakedChickenBreast;

    public static void main(String[] args) {
        
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
        arrBeanVeggieScramble.add(new Ingredient("Spinach", "1/2 cup(s) (chopped)"));  
        arrBeanVeggieScramble.add(new Ingredient("Bell pepper", "1/4 (diced)"));  
        arrBeanVeggieScramble.add(new Ingredient("Onion", "1/4 (diced)"));  
        arrBeanVeggieScramble.add(new Ingredient("Garlic", "1 clove(s) (minced)"));  
        arrBeanVeggieScramble.add(new Ingredient("Olive oil", "1 tsp"));  

        ArrayList<Ingredient> arrGreenEggScramble = new ArrayList<>(); // veg, low carbs, no beans, greens
        arrGreenEggScramble.add(new Ingredient("Eggs", "2"));
        arrGreenEggScramble.add(new Ingredient("Egg whites", "2"));
        arrGreenEggScramble.add(new Ingredient("Spinach", "1 cup(s) (chopped)"));
        arrGreenEggScramble.add(new Ingredient("Kale", "1/2 cup(s) (chopped)"));
        arrGreenEggScramble.add(new Ingredient("Mushrooms", "1/4 cup(s) (sliced)"));
        arrGreenEggScramble.add(new Ingredient("Olive oil", "1 tsp"));
        arrGreenEggScramble.add(new Ingredient("Salt", "1/4 tsp"));
        arrGreenEggScramble.add(new Ingredient("Black pepper", "1/4 tsp"));

        ArrayList<Ingredient> arrRedOrangeVeggieSalad = new ArrayList<>(); // veg, low carbs, no beans, red + orange
        arrRedOrangeVeggieSalad.add(new Ingredient("Red bell pepper", "1 (sliced)"));
        arrRedOrangeVeggieSalad.add(new Ingredient("Carrot", "1 (shredded)"));
        arrRedOrangeVeggieSalad.add(new Ingredient("Cherry tomatoes", "1/2 cup(s) (halved)"));
        arrRedOrangeVeggieSalad.add(new Ingredient("Orange bell pepper", "1/2 (sliced)"));
        arrRedOrangeVeggieSalad.add(new Ingredient("Olive oil", "1 tbsp"));
        arrRedOrangeVeggieSalad.add(new Ingredient("Red wine vinegar", "1 tbsp"));
        arrRedOrangeVeggieSalad.add(new Ingredient("Salt", "1/4 tsp"));
        arrRedOrangeVeggieSalad.add(new Ingredient("Black pepper", "1/4 tsp"));

        ArrayList <Ingredient> arrPancakes = new ArrayList<>(); // not veg, no meat pref, no veg pref, carbs
        arrPancakes.add(new Ingredient("All-purpose flour", "1 cup(s)"));
        arrPancakes.add(new Ingredient("Milk", "3/4 cup(s)"));
        arrPancakes.add(new Ingredient("Egg", "1"));
        arrPancakes.add(new Ingredient("Baking powder", "2 tsp"));
        arrPancakes.add(new Ingredient("Sugar", "2 tbsp"));
        arrPancakes.add(new Ingredient("Salt", "1/4 tsp"));

        ArrayList<Ingredient> arrCrustlessQuiche = new ArrayList<>(); // not veg, no meat pref, no veg pref, low carbs
        arrCrustlessQuiche.add(new Ingredient("Eggs", "3"));
        arrCrustlessQuiche.add(new Ingredient("Heavy cream", "1/4 cup(s)"));
        arrCrustlessQuiche.add(new Ingredient("Cheddar cheese", "1/2 cup(s)"));
        arrCrustlessQuiche.add(new Ingredient("Spinach", "1/2 cup(s)"));
        arrCrustlessQuiche.add(new Ingredient("Mushrooms", "1/4 cup(s)"));
        arrCrustlessQuiche.add(new Ingredient("Salt", "1/4 tsp"));
        arrCrustlessQuiche.add(new Ingredient("Black pepper", "1/4 tsp"));

        ArrayList<Ingredient> arrSteakAndEggs = new ArrayList<>(); // not veg, pref meat, red meat
        arrSteakAndEggs.add(new Ingredient("Striploin steak", "1"));
        arrSteakAndEggs.add(new Ingredient("Eggs", "2"));
        arrSteakAndEggs.add(new Ingredient("Butter", "1 tbsp"));
        arrSteakAndEggs.add(new Ingredient("Salt", "1/2 tsp"));
        arrSteakAndEggs.add(new Ingredient("Black pepper", "1/4 tsp"));

        ArrayList<Ingredient> arrSmokedSalmonBagel = new ArrayList<>(); // not veg, pref meat, seafood
        arrSmokedSalmonBagel.add(new Ingredient("Bagel", "1"));
        arrSmokedSalmonBagel.add(new Ingredient("Cream cheese", "2 tbsp"));
        arrSmokedSalmonBagel.add(new Ingredient("Smoked salmon", "75 g"));
        arrSmokedSalmonBagel.add(new Ingredient("Cucumber", "3 slice(s)"));
        arrSmokedSalmonBagel.add(new Ingredient("Red onion", "2 tbsp (thinly sliced)"));
        arrSmokedSalmonBagel.add(new Ingredient("Lemon wedge", "1"));

        ArrayList<Ingredient> arrTurkeyBaconAndEggs = new ArrayList<>(); // not veg, pref meat, poultry
        arrTurkeyBaconAndEggs.add(new Ingredient("Turkey bacon", "3 slice(s)"));
        arrTurkeyBaconAndEggs.add(new Ingredient("Eggs", "2"));
        arrTurkeyBaconAndEggs.add(new Ingredient("Butter", "1 tbsp"));
        arrTurkeyBaconAndEggs.add(new Ingredient("Salt", "1/4 tsp"));
        arrTurkeyBaconAndEggs.add(new Ingredient("Black pepper", "1/4 tsp"));

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
        arrVeggieWrap.add(new Ingredient("Bell pepper", "1/4 (sliced)"));
        arrVeggieWrap.add(new Ingredient("Olive oil", "1 tsp"));
        arrVeggieWrap.add(new Ingredient("Salt", "1/4 tsp"));
        arrVeggieWrap.add(new Ingredient("Black pepper", "1/4 tsp"));

        ArrayList<Ingredient> arrEdamameSpinachSalad = new ArrayList<>(); // veg, low carbs, beans
        arrEdamameSpinachSalad.add(new Ingredient("Shelled edamame", "1/2 cup(s)"));
        arrEdamameSpinachSalad.add(new Ingredient("Spinach", "2 cup(s)"));
        arrEdamameSpinachSalad.add(new Ingredient("Cucumber", "1/2 (sliced)"));
        arrEdamameSpinachSalad.add(new Ingredient("Red bell pepper", "1/4 (diced)"));
        arrEdamameSpinachSalad.add(new Ingredient("Olive oil", "1 tbsp"));
        arrEdamameSpinachSalad.add(new Ingredient("Lemon juice", "1 tbsp"));
        arrEdamameSpinachSalad.add(new Ingredient("Salt", "1/4 tsp"));
        arrEdamameSpinachSalad.add(new Ingredient("Black pepper", "1/4 tsp"));

        ArrayList<Ingredient> arrSpinachAvocadoSalad = new ArrayList<>(); // veg, low carbs, no beans, greens
        arrSpinachAvocadoSalad.add(new Ingredient("Spinach", "2 cup(s)"));
        arrSpinachAvocadoSalad.add(new Ingredient("Arugula", "1 cup(s)"));
        arrSpinachAvocadoSalad.add(new Ingredient("Avocado", "1/2 (sliced)"));
        arrSpinachAvocadoSalad.add(new Ingredient("Cucumber", "1/2 (sliced)"));
        arrSpinachAvocadoSalad.add(new Ingredient("Green onion", "2 tbsp (chopped)"));
        arrSpinachAvocadoSalad.add(new Ingredient("Olive oil", "1 tbsp"));
        arrSpinachAvocadoSalad.add(new Ingredient("Lemon juice", "1 tbsp"));
        arrSpinachAvocadoSalad.add(new Ingredient("Salt", "1/4 tsp"));
        arrSpinachAvocadoSalad.add(new Ingredient("Black pepper", "1/4 tsp"));

        ArrayList<Ingredient> arrRedOrangeLunchSalad = new ArrayList<>(); // veg, low carbs, no beans, red + orange
        arrRedOrangeLunchSalad.add(new Ingredient("Red bell pepper", "1 (sliced)"));
        arrRedOrangeLunchSalad.add(new Ingredient("Carrot", "1 (shredded)"));
        arrRedOrangeLunchSalad.add(new Ingredient("Cherry tomatoes", "1/2 cup(s) (halved)"));
        arrRedOrangeLunchSalad.add(new Ingredient("Red onion", "2 tbsp (thinly sliced)"));
        arrRedOrangeLunchSalad.add(new Ingredient("Olive oil", "1 tbsp"));
        arrRedOrangeLunchSalad.add(new Ingredient("Lemon juice", "1 tbsp"));
        arrRedOrangeLunchSalad.add(new Ingredient("Salt", "1/4 tsp"));
        arrRedOrangeLunchSalad.add(new Ingredient("Black pepper", "1/4 tsp"));

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
        arrEggSaladLettuceWrap.add(new Ingredient("Lettuce leaves", "4 (large)"));
        arrEggSaladLettuceWrap.add(new Ingredient("Chives", "1 tbsp (chopped)"));
        arrEggSaladLettuceWrap.add(new Ingredient("Salt", "1/4 tsp"));
        arrEggSaladLettuceWrap.add(new Ingredient("Black pepper", "1/4 tsp"));

        ArrayList<Ingredient> arrBeefBurger = new ArrayList<>(); // not veg, pref meat, red meat
        arrBeefBurger.add(new Ingredient("Beef patty", "1 (150 g)"));
        arrBeefBurger.add(new Ingredient("Burger bun", "1"));
        arrBeefBurger.add(new Ingredient("Cheddar cheese", "1 slice(s)"));
        arrBeefBurger.add(new Ingredient("Lettuce", "1"));
        arrBeefBurger.add(new Ingredient("Tomato", "2 slice(s)"));
        arrBeefBurger.add(new Ingredient("Onion", "2"));
        arrBeefBurger.add(new Ingredient("Ketchup", "1 tbsp"));
        arrBeefBurger.add(new Ingredient("Mustard", "1 tsp"));

        ArrayList<Ingredient> arrTunaMeltSandwich = new ArrayList<>(); // not veg, pref meat, seafood
        arrTunaMeltSandwich.add(new Ingredient("Bread slices", "2"));
        arrTunaMeltSandwich.add(new Ingredient("Canned tuna (in water, drained)", "1/2 cup(s)"));
        arrTunaMeltSandwich.add(new Ingredient("Mayonnaise", "2 tbsp"));
        arrTunaMeltSandwich.add(new Ingredient("Cheddar cheese", "1 slice(s)"));
        arrTunaMeltSandwich.add(new Ingredient("Tomato", "2 slice(s)"));
        arrTunaMeltSandwich.add(new Ingredient("Butter", "1 tbsp"));

        ArrayList<Ingredient> arrChickenCaesarSalad = new ArrayList<>(); // not veg, pref meat, poultry
        arrChickenCaesarSalad.add(new Ingredient("Romaine lettuce", "2 cup(s)"));
        arrChickenCaesarSalad.add(new Ingredient("Grilled chicken breast (sliced)", "100 g"));
        arrChickenCaesarSalad.add(new Ingredient("Parmesan cheese (shaved)", "2 tbsp"));
        arrChickenCaesarSalad.add(new Ingredient("Croutons", "1/4 cup(s)"));
        arrChickenCaesarSalad.add(new Ingredient("Caesar dressing", "2 tbsp"));
        arrChickenCaesarSalad.add(new Ingredient("Olive oil", "1 tsp"));
        arrChickenCaesarSalad.add(new Ingredient("Salt", "1/4 tsp"));
        arrChickenCaesarSalad.add(new Ingredient("Black pepper", "1/4 tsp"));

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

        pickBreakfast();
        pickLunch();
        pickDinner();

        System.out.println("Your meals for today: \n");
        System.out.println("Breakfast: " + breakfast.getName());
        System.out.println("Lunch: " + lunch.getName());
        System.out.println("Dinner: " + dinner.getName());

        // based on user survey results we equate one of the recipes to equal each: breakfast, lunch, dinner
    }

    public static void pickBreakfast() {
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

    public static void pickLunch() {
        
    }

    public static void pickDinner() {
        
    }
}