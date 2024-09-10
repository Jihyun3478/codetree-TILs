import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] numbers = new int[n];
        int cnt = 0;
        for(int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
            
            if(numbers[i] == m) {
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}