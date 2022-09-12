import java.net.SocketOption;
import java.util.Scanner;

public class twod {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        int arr[][] = new int [3][3];

        // input for 2d array.
        for (int row = 0; row <  arr.length; row++) {
            // for each col in every row
            for (int col = 0; col <arr[row].length ; col++) {
                arr[row][col]=sc.nextInt();
            }
            
        }

        // Output of array

        for (int row = 0; row <  arr.length; row++) {
            // for each col in every row
            for (int col = 0; col <arr[row].length ; col++) {
                System.out.print(arr[row][col]+ " ");
            }
            System.out.println();

        }

    }
}
