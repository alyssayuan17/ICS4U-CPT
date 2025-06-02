import java.util.ArrayList;

public class Day {
    private Recipe breakfast; 
    private Recipe lunch; 
    private Recipe dinner; 
    private ArrayList <Ingredient> groceryList = new ArrayList<>();
    
    public Day(Recipe breakfast, Recipe lunch, Recipe dinner, ArrayList<Ingredient> groceryList) {
        this.breakfast = breakfast;
        this.lunch = lunch;
        this.dinner = dinner;
        this.groceryList = groceryList;
    }

    public void createGroceryList(Ingredient [] breakfast, Ingredient [] lunch, Ingredient [] dinner) {
        for (int i = 0; i < breakfast.length; i++) {
            if (!groceryList.contains(breakfast[i])) {
                groceryList.add(breakfast[i].getName);
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