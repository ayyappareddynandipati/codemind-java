import java.util.*;
public class MyClass
{
    public static void main(String args[])
    {
        Scanner read = new Scanner (System.in);
        int a = read.nextInt();
        int cnt=0;
        int[] arr = new int[a];
        for(int i=0;i<a;i++)
        {
            arr[i] = read.nextInt();
        }
        for(int i=0;i<a;i++)
        {
            if (arr[i]%2!=0)
            {
                cnt+=1;
            }
        }
        if (cnt<=2) System.out.println("YES");
        else System.out.println("NO");
    }
}