import java.util.*;
public class MyClass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] arr = new int[t];
        for(int i=0;i<t;i++)
        {
            arr[i]=sc.nextInt();
        }
        int fsum=0,lsum=0;
        for(int j=0;j<t/2;j++)
        {
            fsum+=arr[j];
        }
        for(int k=t/2;k<t;k++)
        {
            lsum+=arr[k];
        }
        System.out.println(fsum);
        System.out.print(lsum);
    }
}