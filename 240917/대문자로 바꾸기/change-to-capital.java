import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[][] alphabet = new char[5][3];

        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 3; j++) {
                alphabet[i][j] = sc.next().charAt(0);
            }
        }

        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 3; j++) {
                alphabet[i][j] = Character.toUpperCase(alphabet[i][j]);
                System.out.print(alphabet[i][j] + " ");
            }

            System.out.println();
        }
    }
}