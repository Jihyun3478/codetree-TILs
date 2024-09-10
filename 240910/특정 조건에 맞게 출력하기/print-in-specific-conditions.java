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

        for(int i = 0; i < index; i++) {
            if(numbers[i] % 2 == 1) {
                System.out.print(numbers[i]+3 + " ");
            } else if(numbers[i] % 2 == 0) {
                System.out.print(numbers[i]/2 + " ");
            }
        }
    }
}