import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = "";
        String B = "";

        String answer1 = A+B;
        String answer2 = B+A;

        if(answer1.equals(answer2)) {
            System.out.print("true");
        } else {
            System.out.print("false");
        }
    }
}