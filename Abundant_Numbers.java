import java.util.*;
public class MyClass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum=0;
        for(int i=1;i<a;i++)
        {
            if (a%i==0)
            {
                sum+=i;
            }
        }
        if (sum>a) System.out.print("True");
        else System.out.print("False");
    }
}