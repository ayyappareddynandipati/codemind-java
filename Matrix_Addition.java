import java.util.*;

public class MyClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        // Reading dimensions of first matrix
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[][] m1 = new int[a][b];
        
        // Reading elements of first matrix
        for(int i = 0; i < a; i++) {
            for(int j = 0; j < b; j++) {
                m1[i][j] = sc.nextInt();
            }
        }
        
        // Reading dimensions of second matrix
        int c = sc.nextInt();
        int d = sc.nextInt();
        int[][] m2 = new int[c][d];
        
        // Reading elements of second matrix
        for(int i = 0; i < c; i++) {
            for(int j = 0; j < d; j++) {
                m2[i][j] = sc.nextInt();
            }
        }
        
        // Performing matrix addition
        if (a == c && b == d) {
            int[][] resultMatrix = new int[a][b];
            for(int i = 0; i < a; i++) {
                for(int j = 0; j < b; j++) {
                    resultMatrix[i][j] = m1[i][j] + m2[i][j];
                }
            }
            
            // Printing result matrix
            for(int i = 0; i < a; i++) {
                for(int j = 0; j < b; j++) {
                    System.out.print(resultMatrix[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Matrices cannot be added. Dimensions do not match.");
        }
    
    }
}
