import java.util.*;
public class MyClass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int cnt=1;
        for(int i=1;i<Math.sqrt(a);i++)
        {
            if (a%i==0)
            {
                cnt+=1;
            }
        }
        if (cnt==2) System.out.print("prime");
        else System.out.print("not a prime");
    }
}