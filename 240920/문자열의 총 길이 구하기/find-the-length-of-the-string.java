import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] strArr = new String[10];
        for(int i = 0; i < 10; i++) {
            strArr[i] = sc.next();
        }

        String str = "";
        for(int i = 9; i >= 0; i--) {
            str += strArr[i];
        }
        System.out.print(str.length());
    }
}