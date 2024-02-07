import java.io.*;
import java.util.*;
public class RainDrop
{
 public static void main(String args[])
 {
 int number;
 Scanner s=new Scanner(System.in);
 // Reading a number
 number = s.nextInt();
 // Logic to convert a number into a string contains raindrop sounds corresponding to
 // certain potential factors and prints the corresponding result.
 if(number % 3 == 0)
 System.out.print("Pling");
 if(number % 5 == 0)
 System.out.print("Plang");
 if(number % 7 == 0)
 System.out.print("Plong");
 if(number % 3 != 0 && number % 5 != 0 && number % 7 != 0)
 System.out.println(number);
 }
}