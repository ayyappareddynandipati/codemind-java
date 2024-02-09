import java.util.*;
public class MyClass
{
    public static void main(String args[])
    {
        Scanner read = new Scanner(System.in);
        float a = read.nextFloat();
        if (a<150.0) System.out.print("Person is Dwarf.");
        else if (a>150.0 && a<=165.0) System.out.print("Person is average heighted.");
        else if (a>165.0 && a<=195.0) System.out.print("Person is taller.");
        else System.out.print("Abnormal height.");
    }
}
