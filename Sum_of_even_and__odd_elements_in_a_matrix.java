import java.util.*;
import java.util.Arrays;
public class MyClass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int r = sc.nextInt();
        int[][] arr = new int[c][r];
        int esum=0,osum=0;
        for(int i=0;i<c;i++)
        {
            for(int j=0;j<r;j++)
            {
                arr[i][j]=sc.nextInt();
                if(arr[i][j]%2==0)
                {
                    esum+=arr[i][j];
                }
                else
                {
                    osum+=arr[i][j];
                }
            }
        }
        System.out.print(esum + " " + osum);
    }
}