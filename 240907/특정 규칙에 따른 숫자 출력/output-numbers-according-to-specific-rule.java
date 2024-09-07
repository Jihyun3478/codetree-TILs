import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int cnt = 1;
        int loop = n;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for(int j = loop; j > 0; j--) {
                if(cnt < 10) {
                    System.out.print(cnt + " ");
                    cnt++;
                }
            }

            if(cnt > 9) {
                cnt = 1;
            }
            System.out.println();
            loop--;
        }
    }
}