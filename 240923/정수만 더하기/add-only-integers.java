import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        int num = 0;
        
        for(int i = 0; i < A.length(); i++) {
            if(Character.isDigit(A.charAt(i))) {
                num += A.charAt(i) - '0';
            }
        }
        System.out.print(num);
    }
}