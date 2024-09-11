import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Integer[] numbers = new Integer[n];

        for(int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        Arrays.sort(numbers, Collections.reverseOrder());
        // int max = Integer.MIN_VALUE;
        // int temp = 0;
        // for(int i = 1; i < n; i++) {
        //     if(numbers[i-1] < numbers[i]) {
        //         temp = numbers[i-1];
        //         numbers[i-1] = numbers[i];
        //         numbers[i] = temp;
        //     }
        // }

        System.out.print(numbers[0] + " " + numbers[1]);
    }
}