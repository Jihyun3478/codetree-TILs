import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] numbers = new int[2][4];
        double[] widthSum = new double[2];
        double[] heightSum = new double[4];
        double totalSum = 0;

        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 4; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < 2; i++) {
            widthSum[i] = (numbers[i][0] + numbers[i][1] + numbers[i][2] + numbers[i][3]) / 4.0;
            System.out.printf("%.1f", widthSum[i]);
            System.out.print(" ");
        }
        System.out.println();

        for(int i = 0; i < 4; i++) {
            heightSum[i] = (numbers[0][i] + numbers[1][i]) / 2.0;
            System.out.printf("%.1f", heightSum[i]);
            System.out.print(" ");
        }
        System.out.println();

        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 4; j++) {
                totalSum += numbers[i][j];
            }
        }
        System.out.printf("%.1f", totalSum/8.0);
    }
}