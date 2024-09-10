import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] numbers = new int[10];

        for(int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
            numbers[i] *= numbers[i];

            System.out.print(numbers[i] + " ");
        }
    }
}