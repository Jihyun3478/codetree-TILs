import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i+1; j < arr[i].length; j++) {
                if (arr[j] < arr[i]) {
                    min = j;
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
    }
}