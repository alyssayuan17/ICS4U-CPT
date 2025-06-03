import java.util.ArrayList;
import java.util.Scanner; 

public class Account {

    //scanner 
    static Scanner in = new Scanner(System.in); 
    
    //instance variables for storage of days and recipes
    private ArrayList <Day> days = new ArrayList<>(); //they can add days. each day has a breakfast, lunch, dinner 
    private ArrayList <Recipe> recipes = new ArrayList<>(); //contains preset 9 recipes + any custom recipes user creates 

    //instance variables for account info 
    private String firstName; 
    private String lastName;
    
    //more instance variables that store preferences from initial dietary needs survey 
    private boolean vegetarian; 
    private String preferMeat; //options: none || red || seafood || poultry
    private boolean preferAltProtein; //beans, tofu, etc.
    private boolean preferCarbs;
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
            }
        }

        


       //return Account ();
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
    public Account(String firstName, String lastName, boolean vegetarian, String preferMeat, boolean preferAltProtein, boolean preferCarbs, String preferVeg, ArrayList <Day> days, ArrayList <Recipe> recipes) {
        this.vegetarian = vegetarian;
        this.preferMeat = preferMeat;
        this.preferAltProtein = preferAltProtein;
        this.preferCarbs = preferCarbs;
        this.preferVeg = preferVeg;
        this.days = days; 
        this.recipes = recipes; 
    }

    public ArrayList<Day> getDays() {
        return days;
    }

    public ArrayList<Recipe> getRecipes() {
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

    public void setDays(ArrayList<Day> days) {
        this.days = days;
    }

    public void setRecipes(ArrayList<Recipe> recipes) {
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
