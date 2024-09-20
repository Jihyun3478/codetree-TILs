import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] numbers = new int[n][n];
        int num = 1;

        for(int i = n-1; i >= 0; i--) {
            if(n % 2 == 0) {
                if(i % 2 == 1) {
                    for(int j = n-1; j >= 0; j--) {
                        numbers[j][i] = num;
                        num++;
                    }
                } else if(i % 2 == 0) {
                    for(int j = 0; j < n; j++) {
                        numbers[j][i] = num;
                        num++;
                    }
                }
            } else if(n % 2 == 1) {
                if(i % 2 == 0) {
                    for(int j = n-1; j >= 0; j--) {
                        numbers[j][i] = num;
                        num++;
                    }
                } else if(i % 2 == 1) {
                    for(int j = 0; j < n; j++) {
                        numbers[j][i] = num;
                        num++;
                    }
                }
            }
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}