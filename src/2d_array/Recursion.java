import java.util.Scanner;


public class Recursion {
    public static int gcd(int a, int b ){
        if(a==0){
            return b;
        }
        if(b==0){
            return a;
        }
        while(a!=b){
            if(a>b){
                a= a-b;
            }
            else{
                b = b-a;
            }

        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(gcd(a,b));

    }
}
