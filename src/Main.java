import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name and initial balance and password");

        //create user
        String name = sc.next();
        double balance = sc.nextDouble();
        String password = sc.next();

        //Creation of the account
        SBIUser acc1 = new SBIUser(name,balance,password);
        System.out.println("The account of new SBI Account is"+acc1.getAccountNo());

        //add amount
        System.out.println("Enter money you want to add");
        int money = sc.nextInt();
        acc1.addMoney(money);

        //Check balance
        double newBalance = acc1.getBalance();
        System.out.println("The new balance is " +newBalance);

        //withdraw money
        System.out.println("Enter amount you want to withdraw");
        int amt = sc.nextInt();
        System.out.println("Enter your password");
        String pass = sc.next();
        String result = acc1.withdrawMoney(amt,pass);
        System.out.println(result);

        // rate of interest
        System.out.println("The interest for 10 yr on "+acc1.getBalance()+ " Rs will be: "+acc1.calculateInterest(10));

    }
}