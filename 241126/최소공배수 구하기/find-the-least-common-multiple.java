import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        printCommonMultiple(n, m);
    }

    public static void printCommonMultiple(int n, int m) {
        int min = 0;
        if(n > m) {
            min = m;
        } else {
            min = n;
        }

        int multiple = min;
        int index = 1;
        while(!(multiple % n == 0 && multiple % m == 0)) {
            multiple = min;
            multiple *= index;
            index++;
        }
        System.out.println(multiple);
    }
}