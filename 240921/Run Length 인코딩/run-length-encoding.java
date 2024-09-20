import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String answer = "";
        int cnt = 1;
        for(int i = 1; i < str.length(); i++) {
            if(str.charAt(i-1) == str.charAt(i)) {
                cnt++;
            } else if(str.charAt(i-1) != str.charAt(i)) {
                answer += str.charAt(i-1);
                answer += String.valueOf(cnt);
                cnt = 1;
            }
        }
        answer += str.charAt(str.length() - 1);
        answer += String.valueOf(cnt);
        
        System.out.println(answer.length());
        System.out.println(answer);
    }
}