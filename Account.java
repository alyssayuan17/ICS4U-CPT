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
