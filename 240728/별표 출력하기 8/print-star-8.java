import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            if(i % 2 == 1) {
                for(int j = 0; j < i+1; i++) {
                    System.out.print("* ");
                }
            } else {
                System.out.println("* ");
            }
             System.out.println();
        }
    }
}