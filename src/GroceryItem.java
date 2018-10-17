public class GroceryItem {
    private String name;
    private double price;
    private int quntity;

    public GroceryItem(String name, double price, int quntity) {
        this.name = name;
        this.price = price;
        this.quntity = quntity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuntity() {
        return quntity;
    }

    public void setQuntity(int quntity) {
        this.quntity = quntity;
    }

    public GroceryItem() {


    }

    public double getCost() {
        double cost = (price * quntity);
        return cost;
    }

}
