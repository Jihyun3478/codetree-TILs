import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] numbers = new int[n];
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();

            if(numbers[i] < min) {
                min = numbers[i];
            }
        }

        int cnt = 0;
        for(int i = 0; i < n; i++) {
            if(numbers[i] == min) {
                cnt++;
            }
        }

        System.out.print(min + " " + cnt);
    }
}