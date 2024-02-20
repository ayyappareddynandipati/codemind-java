import java.util.*;
public class ClimbingStairs
{
    public static int climbingstairs(int a)
    {
        if (a<=1) 
    {
        return 1;
    }
    else
    {
         return climbingstairs(a-1)+climbingstairs(a-2);
    }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print(climbingstairs(a));
        
    }
}