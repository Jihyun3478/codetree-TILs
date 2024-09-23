import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int len = s.length();
        String order = sc.next();

        for(int i = 0; i < order.length(); i++) {
            if(order.charAt(i) == 'L') {
                s = s.substring(len-1, len) + s.substring(0, len-1);
            } else if(order.charAt(i) == 'R') {
                s = s.substring(len-1, len) + s.substring(0, len-1);
            }
        }
        System.out.print(s);
    }
}