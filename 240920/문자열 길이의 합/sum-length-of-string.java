import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] strArr = new String[n];
        String str = "";
        int cnt = 0;

        for(int i = 0; i < n; i++) {
            strArr[i] = sc.next();
            str += strArr[i];
        }

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'a') {
                cnt++;
            }
        }
        System.out.print(str.length() + " " + cnt);
    }
}