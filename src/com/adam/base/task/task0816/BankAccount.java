package com.adam.base.task.task0816;

/**
 * {class description}
 *
 * @author
 * @versionn 1.0.0
 * @date 2023/8/16
 */
public class BankAccount {
    /*
    银行账户管理 创建一个名为 BankAccount 的类，用于管理银行账户。
    该类包含以下属性和方法：
    属性：账户号码（accountNumber）、账户持有人姓名（accountHolder）、余额（balance）
    方法：构造方法、获取账户号码的方法、获取账户持有人姓名的方法、获取余额的方法、存款方法、取款方法
     */
    private String accountNumber;
    private String accountHolder;
    private Double balance;
    private Double money;


    public BankAccount(String accountNumber,String accountHolder,Double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setsaveMoney(Double money) {
        this.balance = balance + money;
    }

    public void setwithdrawals(Double money) {
        if (money <= balance) {
            balance -= money;
        } else {
            System.out.println("余额不足");

        }
    }
}
