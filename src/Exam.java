
    import java.util.Scanner;
    public class Exam
    {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a  = sc.nextInt();
            int reverse = 0;
            int rem = 0;
            while(a>0){
                rem = a % 10;
                reverse = reverse*10 + rem;
                a /= 10;
            }
            String ans = Integer.toString(a);
            System.out.println(ans);
        }
    }


