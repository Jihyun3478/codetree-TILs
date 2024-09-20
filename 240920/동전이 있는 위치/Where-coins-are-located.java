import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] numbers = new int[n][n];
        int r = 0, c = 0;

        for(int i = 0; i < m; i++) {
            r = sc.nextInt();
            c = sc.nextInt();
            numbers[r-1][c-1] = 1;
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}