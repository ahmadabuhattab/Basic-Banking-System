import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;


    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }


    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String name, double transaction){
        if (findCustomer(name) == null){
            this.customers.add(new Customer(name, transaction));
            return true;
        }
        return false;
    }
    public boolean addCustomerTransaction(String name, double transaction){
        Customer moozing = findCustomer(name);
        if (moozing != null){
            moozing.addTransaction(transaction);
            return true;
        }
        return false;
    }

    private Customer findCustomer(String name) {
        for (int i= 0; i< customers.size(); i++){
            if (this.customers.get(i).getName().equals(name)){
                return this.customers.get(i);
            }
        }
        return null;
    }
}
