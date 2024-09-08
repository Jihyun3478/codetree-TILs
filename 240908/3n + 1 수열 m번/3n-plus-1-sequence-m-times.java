import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();

        int cnt = 0;
        for(int i = 0; i < m; i++) {
            int n = sc.nextInt();

            while(n != 1) {
                if(n % 2 == 0) {
                    n /= 2;
                }
                else if(n % 2 == 1) {
                    n = 3 * n +1;
                }
                cnt++;
            }
            System.out.println(cnt);
        }
    }
}