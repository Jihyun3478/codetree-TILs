import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();
        char c1 = s1.charAt(0);
        char c2 = s2.charAt(0);

        System.out.print((int)c1 + (int)c2 + " " + Math.abs((int)c1 - (int)c2));
    }
}