import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] numbers = new int[n][m];

        int num = 0, col = 0;
        while(col < m) {
            for(int i = 0; i < m; i++) {
                if(col % 2 == 0) {
                    for(int j = 0; j < n; j++) {
                        numbers[j][i] = num;
                        num++;
                    }
                } else if(col % 2 == 1) {
                    for(int j = n-1; j >= 0; j--) {
                        numbers[j][i] = num;
                        num++;
                    }
                }
                col++;
            }
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}