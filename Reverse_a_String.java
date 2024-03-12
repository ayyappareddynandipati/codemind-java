import java.util.*;

public class MyClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        String r = "";
        for (int i = 0; i < n; i++) {
           char c = s.charAt(i);
           {
               r=c+r;
           }
        }
        System.out.print(r);
    }
}
