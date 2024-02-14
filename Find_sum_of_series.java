import java.util.*;
public class MyClass
{
    public static void main(String args[])
    {
        Scanner read = new Scanner(System.in);
        int a = read.nextInt();
        double s = 0.0;
        for(double i=1;i<=a;i++)
        {
            s = s + 1/i;
        }
        System.out.printf("%.2f",s);
    }
}