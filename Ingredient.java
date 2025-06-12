
public class Ingredient {
    //instance variables 
    private String name; 
    private String qty;

    // constructor
    public Ingredient(String name, String qty) {
        this.name = name;
        this.qty = qty;
        //to do: maybe add ingredient type 
    }

    // getters 

    public String getName() {
        return name;
    }

    public String getQty() {
        return qty;
    }

    // setters

    public void setName(String name) {
        this.name = name;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }
    
}