package day20231025;

public class TestTwo {

    public static void main(String[] args) {
        /*
        创建一个名为BankAccount的Java类，具有私有属性balance（初始值为0.0）和以下方法：
        deposit(double amount)：向账户中存入指定金额。
        withdraw(double amount)：从账户中取出指定金额。
        getBalance()：返回当前余额。
        toString()：返回账户信息的字符串表示。
         */
        BankAccount bankAccount = new BankAccount();
        System.out.println(bankAccount);
        bankAccount.deposit(1000000);
        System.out.println(bankAccount.getBalance());
        bankAccount.withdraw(500000);
        System.out.println(bankAccount);
    }
}

class BankAccount{
    private double balance;

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        balance -= amount;
    }

    public double getBalance(){
        return balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "balance=" + balance +
                '}';
    }
}

