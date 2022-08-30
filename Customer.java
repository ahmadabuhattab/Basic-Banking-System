import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> customerlist;

    public Customer(String name, double customerlist) {
        this.name = name;
        this.customerlist = new ArrayList<Double>();
        addTransaction(customerlist);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getCustomerlist() {
        return customerlist;
    }
    public void addTransaction(double transaction){
        this.customerlist.add(transaction);
    }
}