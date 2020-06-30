package BoxingAuto;

import java.util.ArrayList;

/**
 * @author Esmee Zhang
 * @date 6/25/20 2:29 下午
 * @projectName JAVA-master-class
 */
public class Customer {
    private String name;
    private ArrayList<Double> transctions;

    public ArrayList<Double> getTransctions() {
        return transctions;
    }

    public Customer(String name, double initial){
        this.name = name;
        this.transctions = new ArrayList<Double>();
        addTransaction(initial);

    }

    public String getName() {
        return name;
    }

    public void addTransaction(double amount){
        //boxing
        this.transctions.add(amount);
    }

}
