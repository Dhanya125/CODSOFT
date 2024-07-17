import java.util.*;
public class currencyconvertor{
    private static double USD_TO_EUR=0.91;
    private static double USD_TO_GBP=0.77;
    private static double USD_TO_INR=83.55;
    private static double EUR_TO_USD=1.09;
    private static double EUR_TO_GBP=0.94;
    private static double EUR_TO_INR=91.40;
    private static double INR_TO_EUR=0.011;
    private static double INR_TO_GBP=0.0092;
    private static double INR_TO_USD=0.012;
    private static double GBP_TO_EUR=1.19;
    private static double GBP_TO_USD=1.30;
    private static double GBP_TO_INR=108.76;
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        System.out.println("1.USD(US Dollar)\n2.GBP(British Pound)\n3.EUR(Euro)\n4.INR(Indian Rupee)");
        System.out.println("Choose base currency:");
        int bc=in.nextInt();
        double baseRate=1.0;
        String bcs = "";
        switch(bc){
            case 1:
                bcs="USD";
                break;
            case 2:
                bcs="GBP";
                break;
            case 3:
                bcs="EUR";
                break;
            case 4:
                bcs="INR";
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
        System.out.println("1.USD(US Dollar)\n2.GBP(British Pound)\n3.EUR(Euro)\n4.INR(Indian Rupee)");
        System.out.println("Choose target currency: ");
        int tc=in.nextInt();
        double targetRate=1.0;
        String tcs = "";
        switch(tc){
            case 1:
                tcs="USD";
                break;
            case 2:
                tcs="GBP";
                break;
            case 3:
                tcs="EUR";
                break;
            case 4:
                tcs="INR";
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    System.out.print("Enter the amount in "+bcs+": ");
        double amt=in.nextDouble();
        double convamt=0.0;
        switch(bcs){
            case "USD":
                switch(tcs){
                    case "EUR":
                        convamt=amt*USD_TO_EUR;
                        break;
                    case "GBP":
                        convamt=amt*USD_TO_GBP;
                        break;
                    case "INR":
                        convamt=amt*USD_TO_INR;
                        break;
                    default:
                        convamt=amt; 
                        break;
                }
                break;
            case "EUR":
                switch(tcs){
                    case "USD":
                        convamt=amt*EUR_TO_USD;
                        break;
                    case "GBP":
                        convamt=amt*EUR_TO_GBP;
                        break;
                    case "INR":
                        convamt=amt*EUR_TO_INR;
                        break;
                    default:
                        convamt=amt; 
                        break;
                }
                break;
            case "GBP":
                switch(tcs){
                    case "USD":
                        convamt=amt*GBP_TO_USD;
                        break;
                    case "EUR":
                        convamt=amt*GBP_TO_EUR;
                        break;
                    case "INR":
                        convamt=amt*GBP_TO_INR;
                        break;
                    default:
                        convamt=amt; 
                        break;
                }
                break;
            case "INR":
                switch(tcs){
                    case "USD":
                        convamt=amt*INR_TO_USD;
                        break;
                    case "EUR":
                        convamt=amt* INR_TO_EUR;
                        break;
                    case "GBP":
                        convamt=amt*INR_TO_GBP;
                        break;
                    default:
                        convamt=amt; 
                        break;
                }
                break;
            default:
                convamt=amt; 
                break;
        }
      System.out.printf("%.2f %s%n" ,convamt,tcs);
    }
}
