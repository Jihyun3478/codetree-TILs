import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int n = sc.nextInt();

        for(int i = str.length()-1; i >= str.length()-n; i--) {
            if(str.length() < n) {
                System.out.print(str);
                break;
            }
            System.out.print(str.charAt(i));
        }
    }
}