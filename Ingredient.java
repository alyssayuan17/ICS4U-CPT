import java.util.ArrayList; 

public class Ingredient {
    //instance variables 
    private String name; 
    private int qty;
    public Ingredient(String name, int qty) {
        this.name = name;
        this.qty = qty;
    }
    public String getName() {
        return name;
    }
    public int getQty() {
        return qty;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setQty(int qty) {
        this.qty = qty;
    }

    
    
    
}