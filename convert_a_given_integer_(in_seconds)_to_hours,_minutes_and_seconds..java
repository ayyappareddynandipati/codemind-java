import java.util.*;
public class MyClass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = n/3600;
        int m = (n-(h*3600))/60;
        int s = (n-(h*3600)-(m*60));
        System.out.print("H:M:S-"+ h + ":" + m + ":" + s);
    }
}