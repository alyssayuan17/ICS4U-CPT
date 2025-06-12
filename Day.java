import java.util.HashMap; 

public class Day {
    private Recipe breakfast; 
    private Recipe lunch; 
    private Recipe dinner;

    // constructor
    public Day(Recipe breakfast, Recipe lunch, Recipe dinner, HashMap <String, Ingredient> groceryList) {
        this.breakfast = breakfast;
        this.lunch = lunch;
        this.dinner = dinner;
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

}