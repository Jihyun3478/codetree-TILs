import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int l = s.length();

        String answer = s.substring(0, 1) + s.substring(2, l-2) + s.substring(l-1, l);
        System.out.print(answer);
    }
}