import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] n = new int[100];
        int index = 0, sum = 0;
        for(int i = 0; i < 100; i++) {
            n[i] = sc.nextInt();

            if(n[i] == 0) {
                index = i;
                break;
            }
        }

        if(index > 2) {
            for(int i = index-1; i >= index-3; i--) {
                sum += n[i];
            }
            System.out.print(sum);
        } else {
            for(int i = index-1; i >= 0; i--) {
                sum += n[i];
            }
            System.out.print(sum);
        }
    }
}