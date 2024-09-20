import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] strArr = new String[n];

        for(int i = 0; i < n; i++) {
            strArr[i] = sc.next();
        }

        char alphabet = sc.next().charAt(0);
        int cnt = 0;
        String str = "";

        for(int i = 0; i < n; i++) {
            if(strArr[i].charAt(0) == alphabet) {
                cnt++;
                str += strArr[i];
            }
        }

        System.out.print(cnt + " ");
        System.out.printf("%.2f", str.length()/(double)cnt);
    }
}