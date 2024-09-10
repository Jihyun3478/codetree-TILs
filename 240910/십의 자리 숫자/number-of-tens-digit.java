import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[100];
        int index = 0;
        for(int i = 0; i < 100; i++) {
            numbers[i] = sc.nextInt();

            if(numbers[i] == 0) {
                index = i;
                break;
            }
        }
 
        int[] cnt = new int[9];
        for(int i = 0; i < index; i++) {
            int digit = 0;

            if(numbers[i] >= 10) {
                digit = numbers[i] / 10;
            }

            for(int j = 1; j <= 9; j++) {
                if(digit == j) {
                    cnt[j-1]++;
                }
            }
        }

        for(int i = 1; i <= 9; i++) {
            System.out.println(i + " - " + cnt[i-1]);
        }
    }
}