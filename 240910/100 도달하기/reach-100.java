import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] numbers = new int[100];
        numbers[0] = 1;
        numbers[1] = n;
        System.out.print(numbers[0] + " " + numbers[1] + " ");
 
        for(int i = 2; i < 100; i++) {
            numbers[i] = numbers[i-2] + numbers[i-1];
            System.out.print(numbers[i] + " ");

            if(numbers[i] > 100) {
                break;
            }
        }
    }
}