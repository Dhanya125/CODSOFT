import java.util.Scanner;
class BankAcc{
    double bal;
    public BankAcc(double initialBal){
        this.bal=initialBal;
    }
    public double Bal(){
        return bal;
    }
    public void deposit(double amt){
        if(amt>0){
            bal=bal+amt;
            System.out.println("Deposit successful.Your balance is Rs."+bal);
        }
        else{
            System.out.println("Invalid");
        }
    }
    public void withdraw(double amt){
        if (amt>0 && amt<=bal) {
            bal=bal-amt;
            System.out.println("Withdrawal successful.Your balance is Rs."+bal);
        }
        else if(amt>bal){
            System.out.println("Insufficient amount.Your balance is Rs."+bal);
        }
        else{
            System.out.println("Invalid");
        }
    }
}
class ATM{
    private BankAcc acct;
    public ATM(BankAcc acct){
        this.acct=acct;
    }
    public void show(){
        Scanner in = new Scanner(System.in);
        int choice=1;
       do{
            System.out.println("1. Check Balance\n2. Deposit\n3. Withdraw");
            System.out.print("Enter your desired option: ");
            int option=in.nextInt();
            switch(option){
                case 1:
                    checkBalance();
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ");
                    double depamt=in.nextDouble();
                    deposit(depamt);
                    break;
                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    double wdamt=in.nextDouble();
                    withdraw(wdamt);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
      System.out.println("Do you want to continue? (Type 0 to exit, 1 to continue):");
      choice=in.nextInt();
    }while(choice==1);
    }
    public void checkBalance() {
        System.out.println("Your current balance is Rs."+acct.Bal());
    }
    public void deposit(double amt) {
        acct.deposit(amt);
    }
    public void withdraw(double amt) {
        acct.withdraw(amt);
    }
}
public class atminterface{
    public static void main(String[] args){
        BankAcc acc=new BankAcc(1000); 
        ATM x=new ATM(acc);
        x.show();
    }
}

