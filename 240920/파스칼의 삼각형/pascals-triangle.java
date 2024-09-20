import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[][] numbers = new int[n][n];

        for(int i = 0; i < n; i++) {
            numbers[i][i] = 1;
            numbers[i][0] = 1;
        }

        for(int i = 1; i < n; i++) {
            for(int j = 1; j < i+1; j++) {
                numbers[i][j] = numbers[i-1][j-1] + numbers[i-1][j];
            }
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < i+1; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}