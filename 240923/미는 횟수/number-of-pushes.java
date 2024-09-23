import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();
        int n = -1;

        for (int i = 1; i <= A.length(); i++) {
            A = A.charAt(A.length() - 1) + A.substring(0, A.length() - 1);
            if (A.equals(B)) {
                n = i;
                break;
            }
        }
        System.out.println(n);
    }
}