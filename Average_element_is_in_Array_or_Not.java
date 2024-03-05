import java.util.*;
public class MyClass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int sum=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            sum+=a[i];
        }
        int avg = sum/n;
         boolean s = false;
        for(int j=0;j<n;j++)
        {
            if (a[j]==avg)
           {
               s=true;
               break;
           }
        }
        if (s==true) System.out.print("True");
        else System.out.print("False");
    }
}