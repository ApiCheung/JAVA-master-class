package com.Bank;

/**
 * @author Esmee Zhang
 * @date 6/10/20 2:04 下午
 * @projectName JAVA-master-class
 */
public class Account {

    private String number;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;

    private int x;
    private int y;



    //create a constractor
    public Account(){
        //calling another construcroe within a constru=ctor 并且需要在sout前面。
        this("56789", 0,"defualt name","defualt addree","default phone");
        System.out.println("empty constructor called");
    }
    public Account(String number, double balance, String customerEmailAddress, String customerName, String customerPhoneNumber){
        //setNumber(number);//更好的方法是用 this.balance = balance
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public void deposit(double depositAmount){
        this.balance += depositAmount;
        System.out.println("deposit "+ depositAmount + " amount " +this.balance);
    }
    public void withdrawal(double withdrawalAmount){
        if(this.balance -withdrawalAmount <=0){
            System.out.println("only " + this.balance + " not price");
        }else{
            this.balance -= withdrawalAmount;
            System.out.println("withdraw " + withdrawalAmount + " balance " + this.balance);
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
}
