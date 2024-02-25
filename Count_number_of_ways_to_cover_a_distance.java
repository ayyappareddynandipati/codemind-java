import java.util.*;
public class MyClass
{
    static int CountWays(int k)
{
    if(k<0)
    {
        return 0;
    }
    else if (k==0)
    {
        return 1;
    }
    else
    {
        return CountWays(k-1)+CountWays(k-2)+CountWays(k-3);
    }
}
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(CountWays(n));
    }
}