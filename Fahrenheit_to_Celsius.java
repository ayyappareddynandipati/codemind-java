import java.util.*;
public class MyClass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        double f = sc.nextDouble();
        double c = (f-32.00) * (5.00/9.00);
        System.out.printf("%.2f",c);
    }
}