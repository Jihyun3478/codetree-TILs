import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] numbers = new int[100];
        int cnt = 0;
        for(int i = 1; i <= 100; i++) {
            numbers[i-1] = n * i;
            System.out.print(numbers[i-1] + " ");

            if(numbers[i-1] % 5 == 0) {
                cnt++;
            }

            if(cnt == 2) {
                break;
            }
        }
    }
}