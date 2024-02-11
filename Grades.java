import java.util.*;
public class MyClass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int x = (a+b+c+d+e)/5;
        if (x>=90) System.out.print("Grade A");
        else if (x>=80) System.out.print("Grade B");
        else if (x>=70) System.out.print("Grade C");
        else if (x>=60) System.out.print("Grade D");
        else if (x>=50) System.out.print("Grade E");
        else System.out.print("Grade F");
    }
}