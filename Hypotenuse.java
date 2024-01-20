import java.util.*;

public class MyClass {
    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);
        
        int a = read.nextInt();
        int b = read.nextInt();
        
        int res1 = (a * a) + (b * b);
        double res = Math.sqrt(res1);
        
        System.out.printf("%.2f", res);
    }
}
