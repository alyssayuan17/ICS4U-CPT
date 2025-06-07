import java.util.ArrayList;
import java.util.HashMap; 

public class Day {
    private Recipe breakfast; 
    private Recipe lunch; 
    private Recipe dinner;
    private HashMap <String, Ingredient> groceryList = new HashMap<>();
    
    public Day(Recipe breakfast, Recipe lunch, Recipe dinner, HashMap <String, Ingredient> groceryList) {
        this.breakfast = breakfast;
        this.lunch = lunch;
        this.dinner = dinner;
        this.groceryList = groceryList;
    }

    public void createGroceryList(ArrayList <Ingredient> breakfast, ArrayList <Ingredient> lunch, ArrayList <Ingredient> dinner) {
        addToGroceryList(breakfast); 
        addToGroceryList(lunch); 
        addToGroceryList(dinner);
    }

    public void addToGroceryList (ArrayList <Ingredient> breakfast) {
        for (Ingredient i : breakfast) {

            String name = i.getName();
            String qty = i.getQty();

            if (groceryList.containsKey(name)) {

                Ingredient fromList = groceryList.get(name);
                String qtyFromList = fromList.getQty();

                String [] arrQtyFromList = qtyFromList.split(" ");
                double numQtyFromList = Double.parseDouble(arrQtyFromList[0]);
                double numQtyToAdd = Double.parseDouble(qty.split(" ")[0]);

                String temp = String.valueOf(numQtyFromList + numQtyToAdd);
                if (arrQtyFromList.length > 1) {
                    for (int j = 1; j < arrQtyFromList.length-1; j++) {
                        temp += " " + arrQtyFromList[j];
                    }
                }
                fromList.setQty(temp);
                groceryList.replace(name, fromList);
            } else {
                groceryList.put(name, i); 
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

    public HashMap<String, Ingredient> getGroceryList() {
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

    public void setGroceryList(HashMap<String, Ingredient> groceryList) {
        this.groceryList = groceryList;
    }

    

}