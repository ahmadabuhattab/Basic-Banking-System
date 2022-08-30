import java.util.ArrayList;

public class Bank{
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String name){
        Branch nameofBranch = findBranch(name);
        if (nameofBranch == null){
            this.branches.add(new Branch(name));
            return true;
        } else {
            return false;
        }
    }

    public boolean listCustomers(String name, boolean transaction){
        Branch branch = findBranch(name);
        if (branch != null){
            System.out.println("Customer details for branch " + branch.getName());

            ArrayList<Customer> theBranchCustomersinToT = branch.getCustomers();
            for (int i = 0; i < theBranchCustomersinToT.size(); i++){
                Customer theBranchCustomersinToB = theBranchCustomersinToT.get(i);
                System.out.println("Customer: " + theBranchCustomersinToB.getName() + "[" + (i+1) + "]");
                if (transaction){
                    System.out.println("Transactions: " );
                    ArrayList<Double> doubletransaction = theBranchCustomersinToB.getCustomerlist();
                    for (int j = 0 ; j < doubletransaction.size() ; j++){
                        System.out.println("[" + (j+1) + "]" + " Amount " + doubletransaction.get(j));

                    }
                }
            }
            return true;
        } else {
            return false;
        }
        // listCustomers(), has two parameters of type String (name of the Branch), boolean (print transactions) and returns a boolean.
    // Return true if the branch exists or false otherwise. This method prints out a list of customers.
    }



    private Branch findBranch(String branch){
        for (int i =0 ; i<branches.size(); i++){
            if (branches.get(i).getName().equals(branch)){
                Branch off = branches.get(i);
                return off;
            }
        }
        return null;
    }


    public boolean addCustomer(String name0fBranch, String name0fCustomer, double transaction){
        Branch theBranch = findBranch(name0fBranch);
        if (theBranch != null){
            return theBranch.newCustomer(name0fCustomer,transaction);
        }
        return false;
    }



    public boolean addCustomerTransaction(String name0fBranch, String name0fCustomer, double transaction){
        Branch branch = findBranch(name0fBranch);
        if (branch != null){
            return branch.addCustomerTransaction(name0fCustomer, transaction);
        }
        return false;
    }
}