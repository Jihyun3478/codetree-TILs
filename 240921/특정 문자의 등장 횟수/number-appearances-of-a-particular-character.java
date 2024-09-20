import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int cnt1 = 0, cnt2 = 0;

        for(int i = 1; i < str.length(); i++) {
            String temp = String.valueOf(str.charAt(i-1)) + String.valueOf(str.charAt(i));
            if(temp.equals("ee")) {
                cnt1++;
            } else if(temp.equals("eb")) {
                cnt2++;
            }
        }
        System.out.print(cnt1 + " " + cnt2);
    }
}