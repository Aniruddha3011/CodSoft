import java.util.*;
import java.util.Random;


class ATM {
    private int balance;

    ATM(int initialBalance) {
        balance = initialBalance;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public boolean withdraw(int amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
            return false;
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
            return false;
        } else {
            balance -= amount;
            return true;
        }
    }

    public boolean transfer(int amount) {
        return withdraw(amount);
    }
}

class atmmachine {
    private ATM account;
    private int pin;
    private static int pin1;
    private int a;
    private  static int   x;
    private int b;
    private int d = 0;

    atmmachine(ATM account) {
        this.account = account;
    }

    int getbal() {
        return account.getBalance();
    }

    public void withdraw(int amo) {
        System.out.print("Enter your PIN: ");
        Scanner sc = new Scanner(System.in);
        pin=sc.nextInt();
        a=pin;

        d=0;
        while (a!=0) {
            b=a%10;
            d+=1;
            a=a/10;
        }

        if (d == 4 && pin1 == pin) {
            if (account.withdraw(amo)) {
                System.out.println("Cash withdrawn successfully.");
            }
        } else {
            System.out.println("Please enter a valid PIN.");
        }
    }

    void diposite(int amo) {
        System.out.print("Enter your PIN: ");
        Scanner sc = new Scanner(System.in);
        pin = sc.nextInt();
        a = pin;

        d=0;
        while (a!=0) {
            b=a%10;
            d+=1;
            a=a/10;
        }

        if (d == 4 && pin1 == pin) {
            account.deposit(amo);
            System.out.println("Amount deposited successfully.");
        } else {
            System.out.println("Please enter a valid PIN.");
        }
    }

    void transfer(int amo) {
        System.out.print("Enter your PIN: ");
        Scanner sc = new Scanner(System.in);
        pin = sc.nextInt();
        a = pin;

        d=0;
        while (a!=0) {
            b=a%10;
            d+=1;
            a=a/10;
        }

        if (d == 4 && pin1 == pin) {
            if (account.transfer(amo)) {
                System.out.println("Amount transferred successfully.");
            }
        } else {
            System.out.println("Please enter a valid PIN.");
        }
    }

    void exit() {
        System.out.println("Thank You! Visit Again.");
    }

    public static void main(String[] args) {
        ATM myAccount = new ATM(0);
        atmmachine atm = new atmmachine(myAccount);

        Scanner oc = new Scanner(System.in);
        int choice, amo;
        int a,d,b;
        int x;
        long cardNumber;
        String fname, lname, sex, add, no;
        String acc;
        boolean exit=true;
        while(exit==true){
            System.out.println("----- Welcome-----\n");
            System.out.println("1. New User");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            a = oc.nextInt();

            switch (a) {
                case 1:
                    
                    System.out.print("Enter your First Name: ");
                    fname = oc.next();
                    System.out.print("Enter your Last Name: "); // Bank Management System 
                    lname = oc.next();
                    System.out.print("Enter your Sex: ");
                    sex = oc.next();
                    System.out.print("Enter your Mobile Number: ");
                    no = oc.next();
                    System.out.print("Enter your Address: ");
                    add = oc.next();
                    
                    Random rand = new Random();
                    cardNumber = (long)(Math.random() * 1_000_000_000_000_0000L);
                    pin1 = 1000 + rand.nextInt(9000); 

                    System.out.println("Your card number is: " + cardNumber);
                    System.out.println("Your PIN is: " + pin1);
                    break;
            

                case 2:
                    System.out.print("Enter your Account Number: ");
                    acc = oc.next();

                    System.out.print("Set your PIN: ");
                    pin1 = oc.nextInt();
                    break;
                    
                
                    

                case 3:
                    System.out.println("Thank you! Visit again!\n");
                    exit=false;
                    return;

                default:
                    System.out.println("Invalid choice.");
                    return;
            }

            do {
                System.out.println("----- Welcome to Smart ATMachine!-----");
                System.out.println("1. View Balance");
                System.out.println("2. Cash Withdraw");
                System.out.println("3. Cash Deposit");
                System.out.println("4. Cash Transfer");
                System.out.println("5. Exit");

                System.out.print("Enter a choice: ");
                choice = oc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Your balance is: " + atm.getbal());
                        break;

                    case 2:
                        System.out.print("Enter the amount you want to withdraw: ");
                        amo = oc.nextInt();
                        atm.withdraw(amo);
                        break;

                    case 3:
                        System.out.print("Enter the amount you want to deposit: ");
                        amo = oc.nextInt();
                        atm.diposite(amo);
                        break;

                    case 4:
                        System.out.print("Enter the amount you want to transfer: ");
                        amo = oc.nextInt();
                        atm.transfer(amo);
                        break;

                    case 5:
                        atm.exit();
                        
                        break;

                    default:
                        System.out.println("Invalid choice. Please enter a valid choice.");
                        break;
            }
        } while (choice!=5);
    }
    }
}
    


