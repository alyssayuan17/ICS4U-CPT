
public class Ingredient {
    //instance variables 
    private String name; 
    private String qty;

    public Ingredient(String name, String qty) {
        this.name = name;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public String getQty() {
        return qty;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }
    
    
}