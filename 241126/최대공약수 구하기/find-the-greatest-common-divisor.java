import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        printCommonDivisior(n, m);
    }

    public static void printCommonDivisior(int n, int m) {
        int min = 0;
        if(n < m) {
            min = n;
        } else {
            min = m;
        }

        int commonDivisior = 0;
        for(int i = 1; i <= min; i++) {
            if(n % i == 0 && m % i == 0) {
                commonDivisior = i;
            }
        }
        System.out.println(commonDivisior);
    }
}