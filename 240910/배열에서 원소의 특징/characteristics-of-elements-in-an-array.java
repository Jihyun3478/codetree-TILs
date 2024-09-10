import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] n = new int[10];
        int index = 0;

        for(int i = 0; i < 10; i++) {
            n[i] = sc.nextInt();
        }

        for(int i = 0; i < 10; i++) {
            if(n[i] % 3 == 0) {
                index = i-1;
                break;
            }
        }
        System.out.print(n[index]);
    }
}