import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();

        String answer1 = A+B;
        String answer2 = B+A;

        if(answer1.equals(answer2)) {
            System.out.print("true");
        } else if(!answer1.equals(answer2)){
            System.out.print("false");
        }
    }
}