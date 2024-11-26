import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(printMinimum(a, b, c));
    }

    public static int printMinimum(int a, int b, int c) {
        int min = 0;
        if(a <= b && a <= c) {
            min =  a;
        } else if(b <= a && b <= c) {
            min =  b;
        } else if(c <= b && c <= a) {
            min =  c;
        }
        return min;
    }
}