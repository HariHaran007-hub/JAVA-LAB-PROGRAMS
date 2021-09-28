import java.util.Currency;
import java.util.Scanner;

public class Main {

    private static Scanner scanner =  new Scanner(System.in);
    public static void main(String[] args) {

        boolean isNotExecutable = false;
        while (!isNotExecutable){
            System.out.println("Press to perform the action: \n"+
                                "\t1 --> Dollar to Inr\n"+"\t2 --> Inr to Dollar\n"+
                                "\t3 --> Euro --> Inr\n"+"\t4 -->Inr to Euro " );
            int condition = scanner.nextInt();
            System.out.println("Enter amount to be converted:");
            int amount = scanner.nextInt();

            switch (condition){

                case 1:

                    dollarToInr(amount);
                    break;
                case 2:
                    inrToDollar(amount);
                    break;
                case 3:
                    euroToInr(amount);
                    break;
                case 4:
                    inrToEuro(amount);
                    break;
                case 0:
                    System.out.println("Exiting the application......");
                    isNotExecutable = true;
                    break;
            }
        }
    }
    public static void dollarToInr(double amount){
        double Inr = amount * 74.0;
        System.out.println(amount+ Currency.getInstance("USD").getSymbol() +" --> "+"₹"+Inr);
    }
    public static void euroToInr(double amount){
        double Inr = amount * 86.91;
        System.out.println(amount+"€"+" --> "+"₹"+Inr);
    }

    public static void inrToDollar(double amount){
        double dollar = amount / 74.0;
        System.out.println(amount+"₹"+" --> "+dollar+"$");
    }

    public static void inrToEuro(double amount){
        double euro = amount / 86.91;
        System.out.println("₹"+amount+" --> "+euro+"€");
    }


}
