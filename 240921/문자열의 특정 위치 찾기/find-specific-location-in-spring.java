import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char alphabet = sc.next().charAt(0);
        boolean isInclude = false;
        int index = 0;

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == alphabet) {
                index = i;
                isInclude = true;
                break;
            }
        }

        if(isInclude == true) {
            System.out.print(index);
        } else {
            System.out.print("No");
        }
    }
}