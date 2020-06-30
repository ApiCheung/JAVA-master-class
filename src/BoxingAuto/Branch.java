package BoxingAuto;

import java.util.ArrayList;

/**
 * @author Esmee Zhang
 * @date 6/25/20 2:41 下午
 * @projectName JAVA-master-class
 */
public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name){
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName(){
        return name;
    }

    public boolean newCustomer(String customerName, double inital){
        if(findCustomer(customerName) == null){
            this.customers.add(new Customer(customerName, inital));
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String customerName, double amount){
        Customer existingCustomer = findCustomer(customerName);
        if(findCustomer(customerName) != null){
            existingCustomer.addTransaction(amount);
            return true;
        }
        return false;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    private Customer findCustomer(String customerName){
        for(int i=0; i<this.customers.size(); i++){
            Customer checkedCustomer = this.customers.get(i);
            if(checkedCustomer.getName().equals(customerName)){
                return checkedCustomer;
            }
        }
        return null;

    }
}
