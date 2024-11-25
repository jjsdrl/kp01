package day20231026;

import java.util.Arrays;

public class TestFour {
    public static void main(String[] args) {
        /*
        编写一个Java程序，模拟一个简单的银行账户系统。创建一个类BankAccount，具有属性accountNumber、
        holderName、balance，以及方法deposit()和withdraw()。另外，创建一个Bank类，该类包含一个ArrayList
        来管理多个账户，并实现查找特定账户、显示所有账户和计算总余额的功能。
         */
        /*String str = "abc";
        System.out.println(str);
        System.out.println(str.toString());*/

        //int[] arr = {1,2,3,4,5};
        BankAccount[] accounts = {
                new BankAccount(101,"刘诗诗",1000000),
                new BankAccount(102,"温碧霞",10000000),
                new BankAccount(103,"张敏",500000),
                new BankAccount(104,"张曼玉",1000000),
                new BankAccount(105,"朱茵",2000000),
        };
        Bank bank = new Bank(accounts);
        bank.showAllAccountsInfo();
        System.out.println("---------------------------");
        bank.searchInfoByAccountNumber(104);
        System.out.println("---------------------------");
        bank.calculateTotalBalance();
        System.out.println("---------------------------");
        bank.deposit(103,500000);
        System.out.println("---------------------------");
        bank.searchInfoByAccountNumber(103);
    }
}

class Bank{
    BankAccount[] accounts;
    public Bank(){}
    public Bank(BankAccount[] accounts){
        this.accounts = accounts;
    }
    //存钱
    public void deposit(int accountNum,double money){
        for (int i = 0; i < accounts.length; i++) {
            if(accountNum == accounts[i].accountNumber){
                accounts[i].deposit(money);
                break;
            }
        }
    }
    //查找特定账号
    public void searchInfoByAccountNumber(int accountNumber){
        for (int i = 0; i < accounts.length; i++) {
            if(accountNumber == accounts[i].accountNumber){
                System.out.println(accounts[i]);
                break;
            }
        }
    }
    //显示所有账户信息
    public void showAllAccountsInfo(){
        for (int i = 0; i < accounts.length; i++) {
            System.out.println(accounts[i]);
        }
    }
    //计算总余额
    public void calculateTotalBalance(){
        double totalBalance = 0;
        for (int i = 0; i < accounts.length; i++) {
            totalBalance += accounts[i].balance;
        }
        System.out.println("银行的总余额为:"+totalBalance+"元");
    }
    @Override
    public String toString() {
        return "Bank{" +
                "accounts=" + Arrays.toString(accounts) +
                '}';
    }
}
class BankAccount{
    int accountNumber;
    String holderName;
    double balance;
    public BankAccount(){}

    public BankAccount(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public void deposit(double money){
        balance += money;
    }
    public void withdraw(double money){
        balance -= money;
    }

    //重写了从Object类中继承过来的toString方法，使得打印BankAccount类型的对象，会把该对象的所有属性值全部打印出来
    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber=" + accountNumber +
                ", holderName='" + holderName + '\'' +
                ", balance=" + balance +
                '}';
    }
}

