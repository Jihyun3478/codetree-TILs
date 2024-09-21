import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();
        int cnt = 0;

        for(int i = 0; i <= str1.length() - str2.length(); i++) {
            boolean isInclude = true;

            for(int j = 0; j < str2.length(); j++) {
                if(str1.charAt(i + j) != str2.charAt(j)) {
                    isInclude = false;
                    break;
                }
            }

            if(isInclude) {
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}