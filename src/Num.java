import java.io.*;
import java.util.*;
import java.util.Scanner;


public class Num {
    static void PrintWord(char a){
        switch(a){
            case '0':
                System.out.print("zero ");
                break;

            case '1':
                System.out.print("one ");
                break;

            case '2':
                System.out.print("two ");
                break;

            case '3':
                System.out.print("three ");
                break;

            case '4':
                System.out.print("four ");
                break;

            case '5':
                System.out.print("five ");
                break;

            case '6':
                System.out.print("zero ");
                break;

            case '7':
                System.out.print("seven ");
                break;

            case '8':
                System.out.print("eight ");
                break;

            case '9':
                System.out.print("nine ");
                break;



        }
    }
    static void Print_Digits(int N){
//Enter your code here

        String str =   Integer.toString(N);
        for(int i = 0; i<str.length(); i++){
            char c = str.charAt(i);
            PrintWord(c);

        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Print_Digits(a);


    }


}
