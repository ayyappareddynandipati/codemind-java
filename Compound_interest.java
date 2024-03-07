import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double p = sc.nextDouble(); 
        double r = sc.nextDouble(); 
        double t = sc.nextDouble(); 

        double amount = p * Math.pow((1 + r / 100), t);

    
        amount = Math.round(amount * 100.0) / 100.0;


        System.out.printf("%.2f", amount);

    }
}
