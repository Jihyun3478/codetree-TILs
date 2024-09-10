import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] numbers = new int[n];
        int cnt = 0;
        for(int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
            if(numbers[i] % 2 == 0) {
                // cnt++;
                System.out.print(numbers[i] + " ");
            }
        }

        // int[] temp = new int[cnt];
        // int index = 0;
        // for(int i = 0; i < n; i++) {
        //     if(numbers[i] % 2 == 0) {
        //         temp[i] = numbers[i];
        //     }
        // }

        // for(int i = 0; i < cnt; i++) {
        //     System.out.print(temp[i] + " ");
        // }
    }
}