import java.util.Scanner;

public class Start {

    // i = 0 again

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
         n = sc.nextInt();

        int [] arr = new int [5];

        for(int i = 0; i<n; i++){

            arr[i]= sc.nextInt();

        }

        // printing element of array

        for(int num : arr){
            System.out.print(num+" ");
        }
    }
}
