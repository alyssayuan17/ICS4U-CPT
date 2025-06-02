import java.util.ArrayList;

public class Account {
    private ArrayList <Day> days = new ArrayList<>(); //they can add days. each day has a breakfast, lunch, dinner 
    private ArrayList <Recipe> recipes = new ArrayList<>(); //contains preset 9 recipes + any custom recipes user creates 

    //more instance variables that store preferences from initial dietary needs survey 
    private boolean vegetarian; 
    private String preferMeat; //options: no || red || seafood || poultry
    private boolean preferAltProtein; //beans, tofu, etc.
    private boolean preferCarbs;
    private String preferVeg; //options: green || red + orange
    
    /*public static Account accountSetupAndPreferenceSurvey(){

    }*/

    
    
    public static ArrayList<Day> getDays() {
        return days;
    }

    public static void setDays(ArrayList<Day> days) {
        Account.days = days;
    }

    public static ArrayList<Recipe> getRecipes() {
        return recipes;
    }

    public static void setRecipes(ArrayList<Recipe> recipes) {
        Account.recipes = recipes;
    }

    public static boolean isVegetarian() {
        return vegetarian;
    }

    public static void setVegetarian(boolean vegetarian) {
        Account.vegetarian = vegetarian;
    }

    public static String getPreferMeat() {
        return preferMeat;
    }

    public static void setPreferMeat(String preferMeat) {
        Account.preferMeat = preferMeat;
    }

    public static boolean isPreferAltProtein() {
        return preferAltProtein;
    }

    public static void setPreferAltProtein(boolean preferAltProtein) {
        Account.preferAltProtein = preferAltProtein;
    }

    public static boolean isPreferCarbs() {
        return preferCarbs;
    }

    public static void setPreferCarbs(boolean preferCarbs) {
        Account.preferCarbs = preferCarbs;
    }

    public static String getPreferVeg() {
        return preferVeg;
    }

    public static void setPreferVeg(String preferVeg) {
        Account.preferVeg = preferVeg;
    // constructor
    public Account(boolean vegetarian, String preferMeat, boolean preferAltProtein, boolean preferCarbs,
            String preferVeg) {
        this.vegetarian = vegetarian;
        this.preferMeat = preferMeat;
        this.preferAltProtein = preferAltProtein;
        this.preferCarbs = preferCarbs;
        this.preferVeg = preferVeg;
    }
    
    // public static Account accountSetupAndPreferenceSurvey(){
        
    // }

}
