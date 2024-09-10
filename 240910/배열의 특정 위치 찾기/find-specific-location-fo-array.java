import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] n = new int[10];
        int sum1 = 0, sum2 = 0;
        double cnt = 0;
        for(int i = 0; i < 10; i++) {
            n[i] = sc.nextInt();

            if((i+1) % 2 == 0) {
                sum1 += n[i];
            }

            if((i+1) % 3 == 0) {
                sum2 += n[i];
                cnt++;
            }
        }
        System.out.print(sum1 + " ");
        System.out.printf("%.1f", sum2/cnt);
    }
}