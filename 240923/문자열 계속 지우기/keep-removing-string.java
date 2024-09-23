import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();

        StringBuilder sb = new StringBuilder(A);

        int index = sb.indexOf(B);
        while (index != -1) {
            sb.delete(index, index + B.length());
            index = sb.indexOf(B);
        }

        System.out.print(sb.toString());
    }
}