import java.util.*;
public class MyClass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int cnt=0;
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            for(int j=n1;j<=n2;j++)
            {
                if (j%10==2 || j%10==3 || j%10==9)
                {
                    cnt+=1;
                }
            }
            System.out.println(cnt);
        }
    }
}