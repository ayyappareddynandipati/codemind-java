import java.util.*;
public class MyClass
{
    public static void main(String args[])
    {
        Scanner read = new Scanner(System.in);
        int a = read.nextInt();
        double res;
        if (a<=10000) 
        {
            res = 2.0 * a;
            System.out.printf("%.2f",res);
        }
        else if (a<=20000)
        {
            res = a + (a*115.0/100.0);
            System.out.printf("%.2f",res);
        }
        else 
        {
            res = a + (a*125.0/100.0);
            System.out.printf("%.2f",res);
        }
    }
}