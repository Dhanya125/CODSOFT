import java.util.*;
public class studentgradecal{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the number of subjects: ");
        int n=s.nextInt();
        int[] arr=new int[n];
        double sum=0;
        double avg=0;
        char grade;
        if(n<0 || n>10){
            System.out.println("invalid");
            System.exit(0);
        }
        for(int i=0;i<n;i++){
            System.out.print("Enter the marks for each subject: ");
            arr[i]=s.nextInt();
            sum+=arr[i];
        }
        System.out.println("Total marks: "+sum); 
        avg=sum/n;
        System.out.println("Average Percentage: "+avg+"%");
        if(avg>=90){
            grade='A';
        } 
        else if(avg>=80){
            grade='B';
        }
        else if(avg>=70){
            grade='C';
        }
        else if(avg>=60){
            grade='D';
        }
        else{
            grade='F';
        }
        System.out.println("Grade: "+grade);
    }
}