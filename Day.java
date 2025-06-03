import java.util.ArrayList;
import java.util.HashMap;

public class Day {
    private Recipe breakfast; 
    private Recipe lunch; 
    private Recipe dinner; 
    //private ArrayList <Ingredient> groceryList = new ArrayList<>();
    private HashMap <String, Ingredient> groceryList = new HashMap<>();
    
    public Day(Recipe breakfast, Recipe lunch, Recipe dinner, ArrayList<Ingredient> groceryList) {
        this.breakfast = breakfast;
        this.lunch = lunch;
        this.dinner = dinner;
        this.groceryList = groceryList;
    }

    public void createGroceryList(Ingredient [] breakfast, Ingredient [] lunch, Ingredient [] dinner) {
        for (int i = 0; i < breakfast.length; i++) {
            if (!groceryList.contains(breakfast[i])
                groceryList.add(breakfast[i].getName);
            }
        }

    }

    public void createGroceryList(Ingredient [] breakfast, Ingredient [] lunch, Ingredint [] dinner) {
        for (int i = 0; i < breakfast.length; i++) {
            if (groceryList.containsKey(breakfast[i].getName())) { //an ingredient appears more than once (ie. two or more recipes contain same ingredient)
                Ingredient old = groceryList.get(breakfast[i].getName()); //get the Ingredient value in the HashMap from the String key Ingredient name 
                old.setQty(old.getQty() + breakfast[i].getQty()); //new qty = old qty + qty to be added 
                groceryList.replace(breakfast[i].getName(), old); //replace Ingredient value with updated Ingredient (qty of Ingredient has been updated)
            } else {
                groceryList.put(breakfast[i].getName(), breakfast[i]);
            }
        }
    }

    // getters

    public Recipe getBreakfast() {
        return breakfast;
    }

    public Recipe getLunch() {
        return lunch;
    }

    public Recipe getDinner() {
        return dinner;
    }

    public ArrayList<Ingredient> getGroceryList() {
        return groceryList;
    }

    // setters

    public void setBreakfast(Recipe breakfast) {
        this.breakfast = breakfast;
    }

    public void setLunch(Recipe lunch) {
        this.lunch = lunch;
    }

    public void setDinner(Recipe dinner) {
        this.dinner = dinner;
    }

    public void setGroceryList(ArrayList<Ingredient> groceryList) {
        this.groceryList = groceryList;
    }

    
}