import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int L = s.length();

        for(int i = 0; i <= s.length(); i++) {
            System.out.println(s);
            s = s.substring(L-1, L) + s.substring(0, L-1);
        }
    }
}