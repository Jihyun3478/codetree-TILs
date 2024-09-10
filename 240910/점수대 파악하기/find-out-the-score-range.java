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

        int[] scores = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int[] cnt = new int[10];
        for(int i = 0; i < index; i++) {
            for(int j = 1; j < 10; j++) {
                if(scores[j-1] <= numbers[i] && numbers[i] < scores[j]) {
                    cnt[j-1]++;
                }
            }

            if(numbers[i] == 100) {
                cnt[9]++;
            }
        }

        for(int i = 9; i >= 0; i--) {
            System.out.println(scores[i] + " - " + cnt[i]);
        }
    }
}