package BoxingAuto;

/**
 * @author Esmee Zhang
 * @date 6/25/20 2:29 下午
 * @projectName JAVA-master-class
 */
public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank("National Australia Bank");

        if(bank.addBranch("Adelaide")){
            System.out.println("branch adelaide already created");
        }

        bank.addCustomer("Adelaide", "Time", 50.03);
        bank.addCustomer("Adelaide", "Mike",18927);
        bank.addCustomer("Adelaide", "Lisa", 200.92);

        bank.addBranch("Sydney");
        bank.addCustomer("Sydney","Lim",4.4);

        bank.addCustomerTransaction("Adelaide", "Time", 22.44);
        bank.addCustomerTransaction("Adelaide", "Mike", 12.44);
        bank.addCustomerTransaction("Adelaide", "Time", 65.34);

        bank.listCustomers("Adelaide", false);

        if(!bank.addCustomer("Melbourne", "Brain", 5.53)){
            System.out.println("error melbourne dose not exist");
        }

        if(!bank.addBranch("Adelaide")){
            System.out.println("adelaide branch alreay exist");
        }

        if(!bank.addCustomerTransaction("Adelaide", "Fergus",293)){
            System.out.println("customer not exist in the branch");
        }

        if(!bank.addCustomer("Adelaide", "Time", 12.21)){
            System.out.println("customer tim already exists");
        }

        
    }
}
