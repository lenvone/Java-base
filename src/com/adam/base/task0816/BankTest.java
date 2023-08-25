package com.adam.base.task0816;

/**
 * {class description}
 *
 * @author
 * @versionn 1.0.0
 * @date 2023/8/16
 */
public class BankTest {
    public static void main(String[] args) {
            // 创建一个银行账户对象
            BankAccount bank = new BankAccount("11111","Tom",10000.0);

            // 打印账户信息
            System.out.println("账户号码: " + bank.getAccountNumber());
            System.out.println("账户姓名: " + bank.getAccountHolder());
            System.out.println("账户余额: " + bank.getBalance());

            // 存款
            bank.setsaveMoney(500.0);
            System.out.println("存款： " + bank.getBalance());

            // 取款
            bank.setwithdrawals(200.0);
            System.out.println("余额：" + bank.getBalance());
    }
}
