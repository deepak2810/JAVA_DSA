import java.io.*;
import java.util.*;
public class Check {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();

        int sum = a+b+c+d+e;

        int percentage = sum/5;

        if(percentage>80){
            System.out.println('A');

        }
        else if(percentage<80 && percentage>=60){
            System.out.println('B');
        }
        else if(percentage<60 && percentage>=40){
            System.out.println('C');
        }
        else{
            System.out.println('D');
        }
    }
}

