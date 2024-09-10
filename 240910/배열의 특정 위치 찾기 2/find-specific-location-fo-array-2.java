import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] n = new int[10];
        int sum1 = 0, sum2 = 0;
        for(int i = 0; i < 10; i++) {
            n[i] = sc.nextInt();

            if(i % 2 == 0) {
                sum1 += n[i];
            } else if(i % 2 == 1) {
                sum2 += n[i];
            }
        }

        System.out.print(Math.abs(sum1-sum2));
    }
}