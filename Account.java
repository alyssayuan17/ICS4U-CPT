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

    // constructor
    public Account(boolean vegetarian, String preferMeat, boolean preferAltProtein, boolean preferCarbs,
            String preferVeg) {
        this.vegetarian = vegetarian;
        this.preferMeat = preferMeat;
        this.preferAltProtein = preferAltProtein;
        this.preferCarbs = preferCarbs;
        this.preferVeg = preferVeg;
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
