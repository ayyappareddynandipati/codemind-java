import java.util.*;

public class MyClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char c1 = sc.next().charAt(0);
        int n = s.length();
        boolean f = false;
        for (int i = 0; i < n; i++) {
            char c2 = s.charAt(i);
            if (c1 == c2)
            {
                f = true;
                System.out.println("True");
                System.out.print(i);
                break;
            }
        }
        if (!f) System.out.print("False");
    }
}
