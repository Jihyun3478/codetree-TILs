import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        printNumber(N);
    }

    public static void printNumber(int N) {
        int number = 1;
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                if(number >= 10) {
                    number = 1;
                }
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }
}