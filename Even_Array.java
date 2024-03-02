import java.util.*;
public class MyClass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        boolean res = true;
        for(int i=0;i<n;i++)
        {
            if (arr[i]%2!=0)
            {
                res=false;
            }
        }
        if (res==true) System.out.print("True");
        else System.out.print("False");
    }
}
