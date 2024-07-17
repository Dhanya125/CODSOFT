import java.util.*;
public class numbergame{
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        Random i=new Random();
        int n=10;int rounds=0;int score=0;int flag=1;
        while(flag==1){
            rounds++;
            int no=i.nextInt(100);
            int a=0;int x=0;
            System.out.println("Round "+rounds+": Guess the number between 1 and 100:");
            while(a<n && x!=no){
                System.out.print("Enter your guess:");
                x=in.nextInt();
                a++;
                if(x>no){
                    System.out.println("Too high");
                } 
                else if(x<no){
                    System.out.println("Too low");
                } 
                else{
                    System.out.println("You've guessed the number.");
                    score+=(n-a+1);
                }
                if(a==n && x!=no){
                    System.out.println("All the attempts are over.The number was " +no);
                }
            }
            System.out.println("Score:" +score);
            System.out.print("To continue, enter 1 for yes, 0 for no:");
            flag=in.nextInt();
        }
        System.out.println("Game Over! Score: " +score);
    }
}
