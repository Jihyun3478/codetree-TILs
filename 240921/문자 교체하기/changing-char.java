import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();
        
        String answer = str1.substring(0, 2) + str2.substring(2, str2.length());
        System.out.print(answer);
    }
}