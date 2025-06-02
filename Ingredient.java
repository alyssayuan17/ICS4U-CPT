import java.util.ArrayList; 

public class Ingredient {
    //instance variables 
    private String name; 
    private ArrayList <Ingredient> ingredients = new ArrayList<>();
    
    public Ingredient(String name, ArrayList<Ingredient> ingredients) {
        this.name = name;
        this.ingredients = ingredients;
    }
    public String getName() {
        return name;
    }
    public ArrayList<Ingredient> getIngredients() {
        return ingredients;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setIngredients(ArrayList<Ingredient> ingredients) {
        this.ingredients = ingredients;
    } 

    
}