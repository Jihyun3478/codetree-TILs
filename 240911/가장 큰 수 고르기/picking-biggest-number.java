import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[10];
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < 10; i++) {
            numbers[i] = sc.nextInt();

            if(numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.print(max);
    }
}