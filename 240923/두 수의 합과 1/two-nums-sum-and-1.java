import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        String sum = Integer.toString(num1+num2);
        int cnt = 0;

        for(int i = 0; i < sum.length(); i++) {
            int temp = sum.charAt(i) - '0';
            if(temp == 1) {
                cnt++;
            }           
        }
        System.out.print(cnt);
    }
}