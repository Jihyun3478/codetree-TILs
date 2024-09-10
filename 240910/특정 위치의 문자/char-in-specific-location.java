import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] letters = {'L', 'E', 'B', 'R', 'O', 'S'};
        char letter = sc.next().charAt(0);
        boolean isInclude = false;

        for(int i = 0; i < letters.length; i++) {
            if(letters[i] == letter) {
                isInclude = true;
                System.out.print(i);
                break;
            }
        }

        if(isInclude == false) {
            System.out.print("None");
        }
    }
}