import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = Integer.toString(n);
        int sum = 0;

        for(int i = 0; i < s.length(); i++) {
            int temp = s.charAt(i) - '0';
            sum += temp;         
        }
        System.out.print(sum);
    }
}