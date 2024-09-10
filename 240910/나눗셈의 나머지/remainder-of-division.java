import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int[] cnt = new int[10];

        while(a > 1) {
            int remain = a % b;
            a = a/b;

            for(int i = 0; i < 10; i++) {
                if(remain == i) {
                    cnt[i]++;
                }
            }
        }

        int sum = 0;
        for(int i = 0; i < 10; i++) {
            sum += cnt[i]*cnt[i];
        }
        System.out.print(sum);
    }
}