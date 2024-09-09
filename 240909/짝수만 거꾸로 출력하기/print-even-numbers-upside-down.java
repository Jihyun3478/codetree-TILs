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
                cnt++;
            }
        }

        int[] temp = new int[cnt];
        for(int i = 0; i < n; i++) {
            if(numbers[i] % 2 == 0) {
                temp[i] = numbers[i];
            }
        }

        for(int i = cnt-1; i >= 0; i--) {
            System.out.print(temp[i] + " ");
        }
    }
}