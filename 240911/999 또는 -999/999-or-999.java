import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[100];
        int index = 0;

        for(int i = 0; i < 100; i++) {
            numbers[i] = sc.nextInt();

            if(numbers[i] == 999 || numbers[i] == -999) {
                index = i;
                break;
            }
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < index; i++) {
            if(numbers[i] > max) {
                max = numbers[i];
            } else if(numbers[i] < min) {
                min = numbers[i];
            }
        }

        System.out.print(max + " " + min);
    }
}