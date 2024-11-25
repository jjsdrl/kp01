package day20231024;


import java.util.Scanner;

//创建一个名为BankAccount的Java类，具有私有属性balance（初始值为0.0）和以下方法：
//
//        deposit(double amount)：向账户中存入指定金额。
//        withdraw(double amount)：从账户中取出指定金额。
//        getBalance()：返回当前余额。
//        toString()：返回账户信息的字符串表示
public class BankAccount {
    private double balance;

    public void deposit(double amount){
        balance=balance+amount;
    }
    public void withdraw(double amount){
        balance=balance-amount;
    }
    public double getBalance(){

        return balance;
    }
    public String toString(){
        return "余额为"+balance;
    }

}
class TestBalance{
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();

        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("请选择你的操作：1（存款） 2（取款） 3(退出)  4(查询余额)");
            int choice = scanner.nextInt();
            if (choice==1){
                System.out.print("请输入你要存入的金额:");
                int addMoney = scanner.nextInt();
                bankAccount.deposit(addMoney);
                System.out.println();
                System.out.println(bankAccount.toString());

            }else if (choice==2){
                System.out.print("请输入你要取出的金额:");
                int delMoney = scanner.nextInt();
                if (delMoney>bankAccount.getBalance()){
                    System.out.println("您的余额不足");
                }else {
                    bankAccount.withdraw(delMoney);
                    System.out.println();
                    System.out.println(bankAccount.toString());

                }

            } else if (choice==3) {
                System.out.println("谢谢使用！！！");
                break;
            } else if (choice==4) {
                System.out.println(bankAccount.toString());

            }else {
                System.out.println("输入错误，重新输入");
            }

        }

    }
}
