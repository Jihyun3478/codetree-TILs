import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int cnt = n;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= cnt; j++) {
                System.out.print(i + " * " + j + " = " + i*j);
                if(j < cnt) {
                    System.out.print(" / ");
                }
            }
            cnt--;
            System.out.println();
        }
    }
}