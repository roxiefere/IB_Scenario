public class Sales {
    private String itemId;
    private double value;
    private int quantity;

    public Sales(String id, double v, int q){
        this.itemId = id;
        this. value = v;
        this.quantity = q;
    }

    public double getValue(){
        return value;
    }

    public int getQuantity(){
        return quantity;
    }
}
