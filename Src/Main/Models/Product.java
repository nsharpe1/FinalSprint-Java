package Src.Main.Models;

// Constructors
public class Product {
    protected int productId;
    protected String productName;
    protected int productPrice;
    protected int productQuantity;
    protected int productSeller_Id;

    public Product(int id, String name, int price, int quantity, int seller_id){
        productId = id;
        productName = name;
        productPrice = price;
        productQuantity = quantity;
        productSeller_Id = seller_id;
    }

    // Setting parameters
    public void setId(int id){
        productId = id;
    }

    public void setName(String name){
        productName = name;
    }

    public void setPrice(int price){
        productPrice = price;
    }

    public void setQuantity(int quantity){
        productQuantity = quantity;
    }

    public void setSeller_Id(int seller_id){
        productSeller_Id = seller_id;
    }

    // Returning parameters
    public int getId(){
        return productId;
    }

    public String getName(){
        return productName;
    }

    public int getPrice(){
        return productPrice;
    }

    public int getQuantity(){
        return productQuantity;
    }

    public int getSeller_Id(){
        return productSeller_Id;
    }

    // Output
    public String toString(){
        return "Name: " + productName + ", Price: " + productPrice + ", Quantity: " + productQuantity + ", Seller ID: " + productSeller_Id + ", Product ID: " + productId;
    }

    public int getId() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getId'");
    }
}

