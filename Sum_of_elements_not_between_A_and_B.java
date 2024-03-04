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
     int c = sc.nextInt();
      int sum = 0;
        for (int num : a) {
            if (num < b || num > c) {
                sum += num;
            }
        }
        System.out.print(sum);
    }
}