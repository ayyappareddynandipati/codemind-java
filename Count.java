import java.util.*;
public class MyClass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int esum=0,osum=0;
        for(int i=0;i<n;i++)
        {
            if (arr[i]%2==0)
            {
                esum+=1;
            }
            else
            {
                osum+=1;
            }
        }
        System.out.print(esum + " " + osum);
    }
}
