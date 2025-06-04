import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner; 

public class Account {

    //scanner 
    static Scanner in = new Scanner(System.in); 
    
    //instance variables for storage of days and recipes
    //todo: maybe change hashmap to arraylist 
    private HashMap <String, Day> days = new HashMap<>(); //they can add days. each day has a breakfast, lunch, dinner 
    private HashMap <String, Recipe> recipes = new HashMap <>(); //contains preset 9 recipes + any custom recipes user creates 

    //instance variables for account info 
    private String firstName; 
    private String lastName;
    
    //more instance variables that store preferences from initial dietary needs survey 
    private boolean vegetarian; 
    private String preferMeat; //options: red || seafood || poultry || no preference
    private boolean preferCarbs;
    private boolean preferAltProtein; //beans, tofu, etc.
    private String preferVeg; //options: green || red + orange
    
    public static Account accountSetupAndPreferenceSurvey(){

        System.out.print("Enter first name: ");
        String firstName = in.nextLine();
        System.out.print("Enter last name: ");
        String lastName = in.nextLine(); 

        System.out.print("Vegetarian? (y/n): ");
        String input = in.nextLine();
        boolean vegetarian = false; 
        while (!input.equalsIgnoreCase("y") && !input.equalsIgnoreCase("n")) {
            if (input.equalsIgnoreCase("y")) {
                vegetarian = true; 
            } else if (input.equalsIgnoreCase("n")) {
                vegetarian = false; 
            } else {
                System.out.println("Invalid input. Please try again.");
                input = in.nextLine();
            }
        }

        String preferMeat = "no preference";
        if (vegetarian == false) { //ask for meat preferences ... if vegetarian == true, preferMeat is set to none initially 
            System.out.print("Meat preferences? \na) red \nb) poultry \nc) seafood and fish \nd) no preference \n(a/b/c/d): ");
            input = in.nextLine();
            while (!input.equalsIgnoreCase("a") && !input.equalsIgnoreCase("b") && !input.equalsIgnoreCase("c") && !input.equalsIgnoreCase("d")) {
                if (input.equalsIgnoreCase("a")) {
                    preferMeat = "red";
                } else if (input.equalsIgnoreCase("b")) {
                    preferMeat = "poultry"; 
                } else if (input.equalsIgnoreCase("c")) {
                    preferMeat = "seafood";
                } else if (input.equalsIgnoreCase("d")) {
                    preferMeat = "no preference";
                } else {
                    System.out.println("Invalid input. Please try again.");
                    input = in.nextLine();
                }
            }
        }

        boolean preferCarbs = false; //for meat lovers, set preferCarbs to false 
        if (vegetarian == true || preferMeat.equalsIgnoreCase("none")) { //run if statement for people who don't prefer meat 
            System.out.print("Do you prefer a low-carb diet? (y/n): ");
            input = in.nextLine();
            while (!input.equalsIgnoreCase("y") && !input.equalsIgnoreCase("n")) {
                if (input.equalsIgnoreCase("y")) { //if they want low-carb, set preferCarbs to false 
                    preferCarbs = false; 
                } else if (input.equalsIgnoreCase("n")) { //if they don't want a low-carb diet, set preferCarbs to true 
                    preferCarbs = true; 
                } else {
                    System.out.println("Invalid input. Please try again.");
                    input = in.nextLine();
                }
            }
        }

        boolean preferAltProtein = false; //this preference will be set to false in the cases where the if statement does not run, as those cases already have a preference selected 
        if (vegetarian == true && preferCarbs == false) { //no preference selected yet - refer to tree in work log if confused 
            System.out.print("Do you prefer alternative proteins such as beans and tofu? (y/n): ");
            input = in.nextLine();
            while (!input.equalsIgnoreCase("y") && !input.equalsIgnoreCase("n")) {
                if (input.equalsIgnoreCase("y")) { //if they like altProtein, set to true 
                    preferAltProtein = true; 
                } else if (input.equalsIgnoreCase("n")) { //if they don't like, set to false 
                    preferAltProtein = false; 
                } else {
                    System.out.println("Invalid input. Please try again.");
                    input = in.nextLine();
                }
            }
        }

        String preferVeg = "green"; //default unless indicated otherwise 
        if (vegetarian == true && preferCarbs == false && preferAltProtein == false) {
            System.out.print("Do you prefer: \na) green vegetables \nb) red + orange vegetables \n(a/b): ");
            input = in.nextLine();
            while (!input.equalsIgnoreCase("a") && !input.equalsIgnoreCase("b")) {
                if (input.equalsIgnoreCase("a")) { //if they like altProtein, set to true 
                    preferVeg = "green";
                } else if (input.equalsIgnoreCase("b")) { //if they don't like, set to false 
                    preferVeg = "red + orange";
                } else {
                    System.out.println("Invalid input. Please try again.");
                    input = in.nextLine();
                }
            }
        }

        return new Account(firstName, lastName, vegetarian, preferMeat, preferAltProtein, preferCarbs, preferVeg);
    }

    public void createCustomRecipe() {
        System.out.print("What is the name of your recipe? ");
        Recipe customRecipe = new Recipe(in.nextLine());

        String input; 
        int count = 1; 
        ArrayList <Ingredient> ingredients = new ArrayList<>();
        do {
            System.out.print("Enter done to stop. \nEnter name of ingredient " + count + ": ");
            input = in.nextLine();
            if (input.trim().equalsIgnoreCase("done")) {

            } else {
                Ingredient temp = addCustomIngredient(input); 
                ingredients.add(temp);
            }
        } while (!input.trim().equalsIgnoreCase("done"));
        
        //smth smth arrayList ingredients as a parameter 
        //method print recipe rahhhh 
    }

    public Ingredient addCustomIngredient (String name) {

        int done = 0; 
        String qty; 
        do {
            if () {
                done = 1;
            }
        } while (done == 0); 
        return new Ingredient (name, qty); 
    }

    // constructor
    public Account(String firstName, String lastName,
        boolean vegetarian, String preferMeat, boolean preferAltProtein, boolean preferCarbs,
            String preferVeg) {
        this.vegetarian = vegetarian;
        this.preferMeat = preferMeat;
        this.preferAltProtein = preferAltProtein;
        this.preferCarbs = preferCarbs;
        this.preferVeg = preferVeg;
    }

    //another constructor with all instance variables?
    public Account(String firstName, String lastName, boolean vegetarian, String preferMeat, boolean preferAltProtein, boolean preferCarbs, String preferVeg, HashMap <String, Day> days, HashMap <String, Recipe> recipes) {
        this.vegetarian = vegetarian;
        this.preferMeat = preferMeat;
        this.preferAltProtein = preferAltProtein;
        this.preferCarbs = preferCarbs;
        this.preferVeg = preferVeg;
        this.days = days; 
        this.recipes = recipes; 
    }

    public HashMap<String, Day> getDays() {
        return days;
    }

    public HashMap<String, Recipe> getRecipes() {
        return recipes;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public String getPreferMeat() {
        return preferMeat;
    }

    public boolean isPreferAltProtein() {
        return preferAltProtein;
    }

    public boolean isPreferCarbs() {
        return preferCarbs;
    }

    public String getPreferVeg() {
        return preferVeg;
    }

    public void setDays(HashMap<String, Day> days) {
        this.days = days;
    }

    public void setRecipes(HashMap<String, Recipe> recipes) {
        this.recipes = recipes;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    public void setPreferMeat(String preferMeat) {
        this.preferMeat = preferMeat;
    }

    public void setPreferAltProtein(boolean preferAltProtein) {
        this.preferAltProtein = preferAltProtein;
    }

    public void setPreferCarbs(boolean preferCarbs) {
        this.preferCarbs = preferCarbs;
    }

    public void setPreferVeg(String preferVeg) {
        this.preferVeg = preferVeg;
    }

}
