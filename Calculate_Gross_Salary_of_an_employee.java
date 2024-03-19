import java.util.*;
public class MyClass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        float bs = sc.nextFloat();
        float hra = sc.nextFloat();
        float da = sc.nextFloat();
        float pf = bs * (12.00f/100.00f);
        float gs = bs + hra + da + pf;
        System.out.printf("%.2f
%.2f",pf,gs);
    }
}