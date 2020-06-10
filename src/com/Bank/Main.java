package com.Bank;

/**
 * @author Esmee Zhang
 * @date 6/10/20 2:04 下午
 * @projectName JAVA-master-class
 */
public class Main {
    public static void main(String[] args) {
        Account bobAccount = new Account();
        bobAccount.setNumber("123415");
        bobAccount.setBalance(29);
        bobAccount.deposit(1100);
        bobAccount.withdrawal(100.0);

        bobAccount.deposit(200);
        bobAccount.withdrawal(20);
    }
}
