import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] numbers = new int[n];
        int cnt = 0, index = 0;
        for(int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();

            if(numbers[i] == 2) {
                cnt++;
            }

            if(cnt == 3) {
                index = i+1;
                System.out.print(index);
                break;
            }
        }
    }
}