import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the length of the array
        int N = scanner.nextInt();
        
        // Read the elements of the array
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        
        // Check if the array is ascending
        boolean isAscending = true;
        for (int i = 1; i < N; i++) {
            if (arr[i] <= arr[i - 1]) {
                isAscending = false;
                break;
            }
        }
        
        // Print the result
        if (isAscending == true) System.out.print("yes");
        else System.out.print("no");
    }
}
