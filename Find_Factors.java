import java.util.*;
public class MyClass
{
    public static void main(String args[])
    {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        for(int i=1;i<=n;i++)
        {
            if (n%i==0)
            {
                System.out.print(i + " ");
            }
        }
        
    }
}