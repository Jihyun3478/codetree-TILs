import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();

        String temp1 = s1 + s2;
        String temp2 = s2 + s1;
        
        System.out.print(Integer.parseInt(temp1) + Integer.parseInt(temp2));
    }
}