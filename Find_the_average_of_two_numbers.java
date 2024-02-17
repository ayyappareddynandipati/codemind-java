import java.util.*;

public class MyClass {
    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);

        int a = read.nextInt();
        int b = read.nextInt();

        // Cast one of the operands to float before division
        float avg = (float) (a + b) / 2;

        // Format and print the result with up to 4 decimal places
        System.out.printf("%.4f%n", avg);
    }
}
