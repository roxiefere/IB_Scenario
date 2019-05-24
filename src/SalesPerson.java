public class SalesPerson {
    private String id;
    private Sales[] salesHistory;
    private int count = 0;

    public SalesPerson(String id){
        this.id = id;
    }

    public SalesPerson(String id, Sales[] s, int c){
        this.id = id;
        this.salesHistory = s;
        this. count = c;
    }

    public int getCount(){
        return count;
    }

    public String getId(){
        return id;
    }

    public Sales[] getSalesHistory() {
        return salesHistory;
    }

    public void setSalesHistory(Sales s){
        salesHistory[count] = s;
        count = count + 1;
    }

    public double calcTotalSales(){
        for(int i= 0; i < salesHistory.length; i++){
            count += i;
        }
        return count;
    }

    public Sales largestSale(){
        double max = 0;
        for(int i = 1; i < salesHistory.length; i ++){
            if(salesHistory[i].getValue(); > salesHistory[i-1].getValue();){
                max = salesHistory[i].getValue();
            }
        }
        return max;
    }
}
