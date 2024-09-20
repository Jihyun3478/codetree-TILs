import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] strArr = new String[10];

        for(int i = 0; i < 10; i++) {
            strArr[i] = sc.next();
        }

        char alphabet = sc.next().charAt(0);
        int cnt = 0;
        for(int i = 0; i < 10; i++) {
            int len = strArr[i].length() - 1;
            if(strArr[i].charAt(len) == alphabet) {
                System.out.println(strArr[i]);
                cnt++;
            }
        }

        if(cnt == 0) {
            System.out.print("None");
        }
    }
}