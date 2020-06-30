package BoxingAuto;

import java.util.ArrayList;

/**
 * @author Esmee Zhang
 * @date 6/25/20 2:53 下午
 * @projectName JAVA-master-class
 */
public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name){
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String branchName) {
        if (findBranch(branchName) == null) {
        this.branches.add(new Branch(branchName));
        return true;
        }
    return false;
    }

    public boolean addCustomer(String brachName, String customerName, double initial){
        Branch branch = findBranch(brachName);
        if(branch != null){
            return branch.newCustomer(customerName, initial);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double amount){
        Branch branch = findBranch(branchName);
        if(branch != null){
            return branch.addCustomerTransaction(customerName, amount);
        }
        return false;
    }

    private Branch findBranch(String customerName){
        for(int i=0; i<this.branches.size(); i++){
            Branch checkedBranch = this.branches.get(i);
            if(checkedBranch.getName().equals(customerName)){
                return checkedBranch;
            }
        }
        return null;

    }

    public boolean listCustomers(String branchName, boolean showTransactions){
        Branch branch = findBranch(branchName);
        if(branch != null){
            System.out.println("customer detail for branch" + branch.getName());

            ArrayList<Customer> branchCustomers = branch.getCustomers();
            for(int i = 0; i< branchCustomers.size(); i ++){
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println("customer" + branchCustomer.getName() + i);
                if(showTransactions){
                    System.out.println("transactions");
                    ArrayList<Double> transcations = branchCustomer.getTransctions();

                    for(int j = 0; j < transcations.size(); j++){
                        System.out.println("[" + (j+1) +"] Amount" + transcations.get(j));
                    }

                }
            }
            return true;
        }else{
            return false;
        }

    }

}
