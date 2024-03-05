import java.util.*;
public class MyClass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int cnt1=0;
    int cnt2=0;
    while(n>0)
    {
        int rem = n%10;
        if (rem%2==0)
        {
            cnt1+=1;
        }
        else if (rem%2!=0) 
        {
            cnt2+=1;
        }
        n=n/10;
    }
    if (cnt1!=0 && cnt2!=0) System.out.print("Mixed");
    else if (cnt1!=0 && cnt2==0) System.out.print("Even");
    else System.out.print("Odd");
    }
}