import java.util.Scanner;

public class MaxFlag {




    // Main Function
    public static  void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int flag[] = new int[n];
        for(int j= 0; j<n; j++){
            flag[j] = 0;
        }
        int m = sc.nextInt();
        int arr[] = new int[m];
        for(int i = 0; i<m; i++){
            arr[i] = sc.nextInt();
        }

        // traversing given array
        for(int i = 0; i<m; i++){
            if(arr[i]>=1 && arr[i]<=n){
                IncreaseByOne(flag,arr[i]);
            }
            else if(arr[i]==n+1){
                MaxSet(flag);
            }

        }

        for(int i : flag){
            System.out.print(i+" ");
        }



    }
    static void IncreaseByOne(int arr[], int index){
        arr[index]+=1;
    }

     static void MaxSet(int arr[]){
        int n = arr.length;
        int max = 0;
        for(int i = 0; i<n; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        // setting each element of array to max.
        for(int i = 0; i<n; i++){
            arr[i] = max;
        }
//        for(int i = 0; i<n; i++){
//            System.out.print(arr[i]+ " ");
//        }
    }
}
