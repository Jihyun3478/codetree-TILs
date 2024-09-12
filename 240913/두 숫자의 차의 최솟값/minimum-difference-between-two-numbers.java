import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] numbers = new int[n];
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        int diff = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(numbers[j] != numbers[i]) {
                    diff = Math.abs(numbers[j] - numbers[i]);
                    
                    if(diff < min) {
                        min = diff;
                    }
                }
            }
        }
        System.out.print(diff);
    }
}