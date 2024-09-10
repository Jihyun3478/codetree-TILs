import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int[] numbers = new int[10];
        numbers[0] = a;
        numbers[1] = b;
        System.out.print(numbers[0] + " " + numbers[1] + " ");

        for(int i = 2; i < 10; i++) {
            numbers[i] = (numbers[i-2] + numbers[i-1]) % 10;
            System.out.print(numbers[i] + " ");
        }
    }
}