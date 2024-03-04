import java.util.*;
public class MyClass
{
    public static void main(String args[])
    {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int[] a = new int[n];
     for(int i=0;i<n;i++)
     {
         a[i]=sc.nextInt();
     }
     int b = sc.nextInt();
     int cnt=0;
     for(int j=0;j<b;j++)
     {
         cnt+=a[j];
     }
     System.out.print(cnt);
    }
}