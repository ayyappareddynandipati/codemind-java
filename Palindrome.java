import java.util.*;

public class MyClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = a;
        int reversedNum = 0;
        while (a > 0) {
            int rem = a % 10;
            reversedNum = reversedNum * 10 + rem;
            a = a / 10;
        }
        if (b == reversedNum) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
