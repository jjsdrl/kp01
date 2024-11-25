package day20231025;

import day20231024.BankAccount;

import java.util.Arrays;

public class TestFour {
    public static void main(String[] args) {
        BankAccountTwo baOne = new BankAccountTwo(101,"刘试试",0);
        BankAccountTwo[] accounts={
                baOne,
                new BankAccountTwo(101,"刘试试",12000),
                new BankAccountTwo(103,"程鹏",12000),
                new BankAccountTwo(104,"吴凯琪",210000),
                new BankAccountTwo(105,"周旭",2450)


        };
        Bank bank =new Bank(accounts);
        System.out.println(bank);
        bank.showAllAccountsInfo();
        bank.searchInfoByAccountNumber(103);
        bank.calculateTotalBalance();
    }
}
class Bank{
    BankAccountTwo[] accounts;
    public Bank(){

    }
    public void deposit(int accountNum,double money){
        for (int i = 0; i < accounts.length; i++) {
            if (accountNum==accounts[i].accountNumber){
                accounts[i].deposit(money);
                break;
            }
        }
    }
    public void searchInfoByAccountNumber(int accountNumber){
        for (int i = 0; i < accounts.length; i++) {
            if (accountNumber==accounts[i].accountNumber){

                System.out.println(accounts[i]);
                break;
            }
        }
    }
    public void showAllAccountsInfo(){
        for (int i = 0; i < accounts.length; i++) {
            System.out.println(accounts[i]);
        }
    }
    public void calculateTotalBalance(){
        double totalbance = 0;
        for (int i = 0; i < accounts.length; i++) {
            totalbance+=accounts[i].balance;
        }
        System.out.println("银行的总余额为："+totalbance+"元");
    }
//重写了从Object类中继承过来的toString方法，使得打印BankAccount类型的对象，使得打印BankAccount类型的对象，会把该对象的所有属性值全部打印出来
    @Override
    public String toString() {
        return "Bank{" +
                "accounts=" + Arrays.toString(accounts) +
                '}';
    }

    public Bank(BankAccountTwo[] accounts){
        this.accounts=accounts;

    }
}
class BankAccountTwo{
    int accountNumber;
    String holdName;
    double balance;

    public BankAccountTwo(int accountNumber, String holdName, double balance) {
        this.accountNumber = accountNumber;
        this.holdName = holdName;
        this.balance = balance;
    }

    public void deposit(double money){
        balance +=money;
    }
    public void withdraw(double money){
        balance -=money;
    }
}