import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] numbers1 = new int[3][3];
        int[][] numbers2 = new int[3][3];

        int num = 1;
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                numbers1[i][j] = num;
                numbers2[i][j] = num+1;
                num++;
            }
        }
        
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(numbers1[i][j]*numbers2[i][j] + " ");
            }
            System.out.println();
        }
    }
}