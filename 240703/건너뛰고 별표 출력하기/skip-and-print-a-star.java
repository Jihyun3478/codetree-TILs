import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            for(int j = 1; j <= i+1; j++) {
                System.out.print("*");
            }
            System.out.print("\n\n");
        }

        for(int i = 0; i < n-1; i++) {
            for(int j = n-i-1; j > 0; j--) {
                System.out.print("*");
            }
            System.out.print("\n\n");
        }
    }
}